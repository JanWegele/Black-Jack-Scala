package BlackJack
package aview

import controller.Controller
import model.Deck
import model.Grid
import util.Observer

import scala.io.StdIn.readLine
import java.io.BufferedReader


case class TUI(controller: Controller) extends Observer {
  controller.add(this)

  val grid: Grid = controller.grid
  val deck = new Deck()
  val eol: String = grid.eol

  def inputLoop(grid: Grid): Unit =
    val input = readLine("Input: ")
    input match {
      case "q" => sys.exit()
      case "c" => println("Erstelle einen BlackJack Tisch" + eol + grid.render())
      case "s" => deck.shuffle()
        println("Kartendeck mischen")
      case _ => println("Falscher Input")
    }
    inputLoop(grid)

  override def update(): Unit =  println(controller.toString)

}
