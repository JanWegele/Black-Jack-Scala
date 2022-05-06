package BlackJack
package model


import scala.collection.mutable
import scala.util.Random
import model.Card

import scala.collection.mutable.ListBuffer

class Deck(pCards: List[Card] = for(s <- Suits.suits; r <- Ranks.ranks) yield Card  (s, r)) {
  val cards = if(isValidDeck(pCards)) pCards.to(ListBuffer)
  else throw new RuntimeException("Invalid Deck")

  def pullFromTop(): Card =
    val topCard = Card(cards.head.suit, cards.head.rank)
    cards.remove(0)
    topCard

  def addToTop(card: Card) = cards.addOne(card)

  def shuffle() = new Deck(Random.shuffle(pCards))

  def getDeckAsString: String =
    var deckAsString: String = ""
    for(element <- cards){
      deckAsString = deckAsString + element.suit.toString + element.rank.toString + ","
    }
    deckAsString

  private def isValidDeck(cards: List[Card]) = cards.size <= 52 && cards.distinct.size == cards.size
}







