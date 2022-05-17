package BlackJack
package aview

import controller.Controller
import model.{Deck, Game, Grid, Player}
import util.Observer

import scala.io.StdIn.readLine
import java.io.BufferedReader
import scala.collection.mutable.ListBuffer
import scala.util.Random


case class TUI(controller: Controller) extends Observer {
  val eol: String = sys.props("line.separator")
  controller.add(this)
  for (i <- 1 to controller.game.playerCount)
    val inputName: String = readLine(s"Name Spieler $i: ")
//    controller.doAndPublish( controller.put, CreatePlayer( inputName ) )


  def inputLoop(game : Game): Unit =
    val input = readLine("Input: ")
    input match {
      case "q" => sys.exit()
      case "c" => println("Erstelle einen BlackJack Tisch" + eol + eol + game.printScoreboard())
//      case "s" => deck.shuffle()
//        println("Kartendeck mischen")
      case _ => println("Falscher Input")
    }
    inputLoop(game)

  override def update(): Unit = println(controller.toString)

}
