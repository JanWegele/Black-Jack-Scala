package BlackJack
package model

import scala.collection.mutable.ListBuffer
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec

class GameSpec extends AnyWordSpec {
  val p1: Player = Player("p1", 0, Deck(List[Card]()))
  val p2: Player = Player("p2", 0, Deck(List[Card]()))
  val playerList: List[Player] = List[Player](p1, p2)
  val game: Game = Game (playerList, gameDeck = Deck(List[Card]()), 0, 2)
  val p3: Player = Player("p3", 0, Deck(List[Card]()))

//  "game" should {
//    "add the dealer to the game" in {}
//    "add a player to the game" in {
//      game.playerList should be (List(p1, p2, p3))
//      game.playerList should have size 3
//    }
//  }
}
