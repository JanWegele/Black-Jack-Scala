package BlackJack.view

import BlackJack.model.CardDeck.*
import BlackJack.model.Grid

import scala.io.StdIn.readLine
import java.io.BufferedReader
import scala.io.StdIn.readLine

class TUI(playerCount: Int) {
  val grid = new Grid(playerCount)
  val deck = new Deck()
  val eol: String = grid.eol

  var stopProcessingInput = false

  def processInput(input: BufferedReader) = {
    while (!stopProcessingInput) {
      if (input.ready()) {
        val line = input.readLine()
        inputLoop(line)
      } else {
        Thread.sleep(200) // don't waste cpu cycles if no input is given
      }
    }
  }

  def inputLoop(input: String) : Unit =
    input match {
      case "q" => sys.exit()
      case "c" => println("Erstelle einen BlackJack Tisch" + eol + grid.render())
      case "s" => deck.shuffle()
                  println("Kartendeck mischen")
      case _ => println("Falscher Input")
    }

}
