package BlackJack
package model

import BlackJack.model
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers.*


class DeckSpec extends AnyWordSpec {
  val deck = Deck()
  "deck" should {
    "shuffle and return a new Deck" in {
      deck.shuffle().getClass should be(BlackJack.model.Deck)
    }
    "add a card to the top of a given deck" in {
      deck.addToTop(Card(Suit.Heart, Rank.Ace))
      deck.cards.head should be (Card(Suit.Heart, Rank.Ace))
    }
    "return the top card of a deck and remove it from the deck" in {
      deck.pullFromTop() should be (deck.cards.head)
    }
  }
}
