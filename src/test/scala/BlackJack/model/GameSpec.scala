package BlackJack
package model

import scala.collection.mutable.ListBuffer
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec

class GameSpec extends AnyWordSpec {
  val p1: Player = Player("p1", 0, Deck(ListBuffer[Card]()))
  val p2: Player = Player("p2", 0, Deck(ListBuffer[Card]()))
  val playerList: ListBuffer[Player] = ListBuffer[Player](p1, p2)
  val game: Game = Game (playerList, gameDeck = Deck(ListBuffer[Card]()), 0, 2)
  game.addPlayer("p3")
  val p3: Player = Player("p3", 0, Deck(ListBuffer[Card]()))

  "game" should {
    "add a player to the game" in {
      game.playerList should be (ListBuffer(p1, p2, p3))
      game.playerList should have size 3
    }

  }
}
