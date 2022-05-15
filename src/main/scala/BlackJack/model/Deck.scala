package BlackJack
package model


import scala.collection.mutable
import scala.util.Random
import model.Card

import scala.collection.mutable.ListBuffer

case class Deck( cards: ListBuffer[Card]) {

  def filledDeck() : Deck = {
    val pCardsArray = for (s <- Suit.values; r<-Rank.values) yield Card(s, r)
    val pCards = new ListBuffer[Card]
    for (element <- pCardsArray){
      pCards.addOne(element)
    }
    Deck(pCards)
  }

  def pullFromTop() : (Card, Deck) = (cards.head, copy(cards.tail))

  def addToTop(card: Card): Deck = this.copy(cards.addOne(card))

  def shuffle(): Deck = Deck(Random.shuffle(cards)) //Factory-Method?

  def getDeckAsString: String =
    val deckAsString: String = ""
    for(element <- cards){
      deckAsString.concat(element.toString + ",")
    }
    deckAsString
    //Strategy
}







