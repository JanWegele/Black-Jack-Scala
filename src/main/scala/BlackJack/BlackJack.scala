package BlackJack

import java.io.BufferedReader
import BlackJack.aview.TUI
import BlackJack.controller.Controller
import BlackJack.model.Grid

import scala.io.StdIn.readLine

@main def hello(): Unit =
  println("!!This is BlackJack!!")
  println("---------------------")
  val playerCount : Int = readLine("Anzahl der Spieler: ").toInt

  val controller = new Controller(new Grid(playerCount))
  val tui = TUI(controller)
  controller.notifyObservers()

  println("Starting the TUI: "+tui.eol)
  //tui.inputLoop(tui.grid)

