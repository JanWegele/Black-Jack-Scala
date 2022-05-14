package BlackJack
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers.*


class DeckSpec extends AnyWordSpec {
  val deck: Deck = Deck(List[Card](Card(Suit.Heart,Rank.Ace), Card(Suit.Spade, Rank.Queen), Card(Suit.Club, Rank.Jack), Card(Suit.Diamond, Rank.Ten)))
  "deck" should {
    "shuffle and return a new Deck" in {
      deck.shuffle().getClass should be (deck.getClass)
    }
//    "add a card to the top of a given deck" in {
//      deck.addToTop(Card(Suit.Heart, Rank.Nine))
//      deck.cards should be (Card(Suit.Heart, Rank.Nine))
//    }
    "return the top card of a deck and remove it from the deck" in {
      deck.pullFromTop() should be (deck.cards.head, Deck(deck.cards.tail))
    }
  }
}
