package BlackJack
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._
import scala.collection.mutable.ListBuffer

class PlayerSpec extends AnyWordSpec {
  val deckPlayer: Deck = Deck(ListBuffer[Card](Card(Suit.Spade, Rank.Queen)))
  val cardPlayer: Card = Card(Suit.Spade, Rank.Queen)
  val player: Player = Player("Bernhardt", 0, deckPlayer)
  "Player" should {
    "be able to change his score" in {
      player.changeScore(21) should be (21)
    }
    "have a name" in {
      player.name should be("Bernhardt")//debug
    }
    "be able to add a Card to the top of the Deck" in {
      player.addToDeck(cardPlayer) should be (deckPlayer.addToTop(cardPlayer))
    }
  }
}