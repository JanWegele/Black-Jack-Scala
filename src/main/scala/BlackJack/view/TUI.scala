package BlackJack.view

import BlackJack.model.CardDeck.*
import BlackJack.model.Grid

import scala.io.StdIn.readLine


class TUI(playerCount : Int) {
  val deck = new Deck()
  deck.shuffle()
  val grid = new Grid(playerCount)

  def print(playerCount: Int): String = grid.render()
}
