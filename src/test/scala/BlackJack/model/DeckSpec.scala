package BlackJack
package model

import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec

import scala.collection.mutable.ListBuffer


class DeckSpec extends AnyWordSpec {

  val card1: Card = Card(Suit.Heart,Rank.Nine)
  val card2: Card = Card(Suit.Club,Rank.Ace)
  val card3: Card = Card(Suit.Diamond,Rank.Ten)
  val card4: Card = Card(Suit.Spade,Rank.Jack)
  val deck: Deck = Deck.apply("empty").addToTop(card1).addToTop(card2).addToTop(card3)
//  "deck" should {
//    "shuffle and return a new Deck" in {
//      deck.shuffle().getClass should be (deck.getClass)
//    }
//    "add a card to the top of a given deck" in {
//      deck.addToTop(Card(Suit.Heart, Rank.Nine)).cards.head should be (Card(Suit.Heart, Rank.Nine))
//      deck.cards should be (Card(Suit.Heart, Rank.Nine))
//    }
//    "return the top card of a deck and remove it from the deck" in {
//      deck.pullFromTop should be (deck.cards.head, Deck(deck.cards.tail))
//    }
//    "return given deck as String" in {
//      deck.getDeckAsString should be (deck.cards.head.toString + "," + deck.cards(1).toString + "," + deck.cards(2).toString + "," + deck.cards(3).toString )
//    }
//  }
}
