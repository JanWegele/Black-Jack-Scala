package BlackJack
package model


import scala.collection.mutable
import scala.util.Random
import model.Card
import scala.collection.mutable.ListBuffer


object Deck {
  def apply() : Deck = {
    val cards = for(s<-Suit.values; r<- Rank.values) yield Card(s, r)
    if( cards.length <= 52 && cards.distinct.length == cards.length )
      Deck( cards = cards.toList )
    else throw new RuntimeException("Invalid Deck")
  }
}

case class Deck( cards: List[Card] ) {



  def pullFromTop() : (Card, Deck) = (cards.head, copy(cards.tail))

  def addToTop(card: Card): Deck = copy(cards = card :: cards)

  def shuffle() = new Deck(Random.shuffle(cards)) //Factory-Method?

  def getDeckAsString: String =
    val deckAsString: String = ""
    for(element <- cards){
      deckAsString.concat(element.toString + ",")
    }
    deckAsString
    //Strategy
}







