package BlackJack

import java.io.BufferedReader
import BlackJack.aview.TUI
import BlackJack.controller.Controller
import BlackJack.model.{Grid, Scoreboard}

import scala.io.StdIn.readLine

@main def hello(): Unit =
  println("!!This is BlackJack!!")
  println("---------------------")
  val playerCount : Int = readLine("Anzahl der Spieler: ").toInt

  val controller = Controller(new Scoreboard(playerCount))
  val tui = TUI(controller)
  controller.notifyObservers()

  println("Starting the TUI: " + tui.eol)
  tui.inputLoop(controller.scoreboard)

