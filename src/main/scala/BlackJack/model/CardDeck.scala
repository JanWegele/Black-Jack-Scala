package BlackJack
package model

import scala.util.Random

object Suit extends Enumeration {

  type Suit = Value

  val Spade, Heart, Club, Diamond = Value
}

object Rank extends Enumeration {
  type Rank = Value

  val Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace = Value
}

val suits = Set(Suit.Spade, Suit.Club, Suit.Heart, Suit.Diamond)
val ranks = List(Rank.Two, Rank.Three, Rank.Four, Rank.Five, Rank.Six, Rank.Seven, Rank.Eight, Rank.Nine, Rank.Ten,
  Rank.Jack, Rank.Queen, Rank.King, Rank.Ace)

class Card(rank: Rank.Rank, suit: Suit.Suit) {}

class Deck(pCards: List[Card] = for (r <- ranks; s <- suits) yield Card(r, s)) {
  val cards: List[Card] = if (isValidDeck(pCards)) pCards
  else throw new RuntimeException("Deck is invalid")

  def shuffle() = new Deck(Random.shuffle(cards))

  def pullFromTop(): (Card, Deck) = (cards.head, new Deck(cards.tail))

  def addToTop(card: Card) = new Deck(card :: cards)

  private def isValidDeck(cards: List[Card]) = cards.size <= 52 && cards.distinct.size == cards.size
}

