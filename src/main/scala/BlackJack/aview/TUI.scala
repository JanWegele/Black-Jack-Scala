package BlackJack
package aview

import controller.Controller
import model.{Deck, Grid, Player, Scoreboard}
import util.Observer

import scala.io.StdIn.readLine
import java.io.BufferedReader
import scala.collection.mutable.ListBuffer
import scala.util.Random


case class TUI(controller: Controller) extends Observer {
  controller.add(this)

  val scoreboard: Scoreboard = controller.scoreboard
  val playDeck = new Deck()
//  deck.shuffle()
  val eol: String = scoreboard.eol
  val playerCount: Int = controller.scoreboard.returnPlayerCount()
  for (i <- 1 to playerCount)
    val inputName: String = readLine(s"Name Spieler ${i}: ")
    val p = new Player(inputName)
    scoreboard.playerList.addOne(p)

  def inputLoop(scoreboard: Scoreboard): Unit =
    val input = readLine("Input: ")
    input match {
      case "q" => sys.exit()
      case "c" => println("Erstelle einen BlackJack Tisch" + eol + eol + scoreboard.printScoreboard())
//      case "s" => deck.shuffle()
//        println("Kartendeck mischen")
      case _ => println("Falscher Input")
    }
    inputLoop(scoreboard)

  override def update(): Unit = println(controller.toString)

}
