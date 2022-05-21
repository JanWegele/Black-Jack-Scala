package BlackJack
package model

import BlackJack.model.Card

//Factory-Method
trait Deck:
  def build: Deck
  def addToTop(card: Card): Deck
  def pullFromTop(): Card
  override def toString: String

private case class filledDeck(cards: List[Card] = (for (s <- Suit.values; r <- Rank.values) yield Card(s, r)).toList) extends Deck :
  override def build: filledDeck = this.copy(cards = (for (s <- Suit.values; r <- Rank.values) yield Card(s, r)).toList)
  override def toString: String =
    val str = this.cards.head.toString
    if (this.cards.length > 1)
      for (card <- this.cards.tail)
        str.concat("," + card.toString)
    str
  override def pullFromTop(): Card = Card(Suit.Heart, Rank.Ace)
  override def addToTop(card: Card): Deck = this

private case class emptyDeck(cards: List[Card]) extends Deck :
  override def build: emptyDeck = this.copy(cards = List[Card]())
  override def toString: String = ""
  override def addToTop(card: Card): Deck = this
  override def pullFromTop(): Card = Card(Suit.Heart, Rank.Ace)

object Deck:
  def apply(state: String): Deck = state match
    case "filled" => filledDeck()
    case "empty" => emptyDeck(List[Card]())