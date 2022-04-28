package BlackJack

import BlackJack.CardDeck._
import BlackJack.Grid
import scala.io.StdIn.readLine


class TUI(playerCount : Int) {
  val deck = new Deck()
  deck.shuffle()
  val grid = new Grid(playerCount)

  def print(playerCount: Int): String = grid.render()
}
