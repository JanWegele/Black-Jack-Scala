package BlackJack
package model


import scala.collection.mutable
import scala.util.Random
import model.Card

import scala.collection.mutable.ListBuffer

class Deck(pCards: List[Card] = for(s <- Suits.suits; r <- Ranks.ranks) yield Card  (s, r)) {
  val cards: ListBuffer[Card] = if(isValidDeck(pCards)) pCards.to(ListBuffer)
  else throw new RuntimeException("Invalid Deck")
//    cards += Card(Suits.Heart, Ranks.Two)
//    cards += Card(Suits.Spade, Ranks.Two)
//    cards += Card(Suits.Club, Ranks.Two)
//    cards += Card(Suits.Diamond, Ranks.Two)
//    cards += Card(Suits.Heart, Ranks.Three)
//    cards += Card(Suits.Spade, Ranks.Three)
//    cards += Card(Suits.Club, Ranks.Three)
//    cards += Card(Suits.Diamond, Ranks.Three)
//    cards += Card(Suits.Heart, Ranks.Four)
//    cards += Card(Suits.Spade, Ranks.Four)
//    cards += Card(Suits.Club, Ranks.Four)
//    cards += Card(Suits.Diamond, Ranks.Four)
//    cards += Card(Suits.Heart, Ranks.Five)
//    cards += Card(Suits.Spade, Ranks.Five)
//    cards += Card(Suits.Club, Ranks.Five)
//    cards += Card(Suits.Diamond, Ranks.Five)
//    cards += Card(Suits.Heart, Ranks.Six)
//    cards += Card(Suits.Spade, Ranks.Six)
//    cards += Card(Suits.Club, Ranks.Six)
//    cards += Card(Suits.Diamond, Ranks.Six)
//    cards += Card(Suits.Heart, Ranks.Seven)
//    cards += Card(Suits.Spade, Ranks.Seven)
//    cards += Card(Suits.Club, Ranks.Seven)
//    cards += Card(Suits.Diamond, Ranks.Seven)
//    cards += Card(Suits.Heart, Ranks.Eight)
//    cards += Card(Suits.Spade, Ranks.Eight)
//    cards += Card(Suits.Club, Ranks.Eight)
//    cards += Card(Suits.Diamond, Ranks.Eight)
//    cards += Card(Suits.Heart, Ranks.Nine)
//    cards += Card(Suits.Spade, Ranks.Nine)
//    cards += Card(Suits.Club, Ranks.Nine)
//    cards += Card(Suits.Diamond, Ranks.Nine)
//    cards += Card(Suits.Heart, Ranks.Ten)
//    cards += Card(Suits.Spade, Ranks.Ten)
//    cards += Card(Suits.Club, Ranks.Ten)
//    cards += Card(Suits.Diamond, Ranks.Ten)
//    cards += Card(Suits.Heart, Ranks.Jack)
//    cards += Card(Suits.Spade, Ranks.Jack)
//    cards += Card(Suits.Club, Ranks.Jack)
//    cards += Card(Suits.Diamond, Ranks.Jack)
//    cards += Card(Suits.Heart, Ranks.Queen)
//    cards += Card(Suits.Spade, Ranks.Queen)
//    cards += Card(Suits.Club, Ranks.Queen)
//    cards += Card(Suits.Diamond, Ranks.Queen)
//    cards += Card(Suits.Heart, Ranks.King)
//    cards += Card(Suits.Spade, Ranks.King)
//    cards += Card(Suits.Club, Ranks.King)
//    cards += Card(Suits.Diamond, Ranks.King)
//    cards += Card(Suits.Heart, Ranks.Ace)
//    cards += Card(Suits.Spade, Ranks.Ace)
//    cards += Card(Suits.Club, Ranks.Ace)
//    cards += Card(Suits.Diamond, Ranks.Ace)



//  def shuffle() = Random.shuffle(cards.)

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







