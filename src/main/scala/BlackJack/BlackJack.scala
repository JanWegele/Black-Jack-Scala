package BlackJack

import java.io.BufferedReader
import BlackJack.aview.TUI
import BlackJack.controller.Controller
import BlackJack.model.{Game, Grid, Player, Scoreboard, Deck}

import scala.io.StdIn.readLine

@main def hello(): Unit =
  println("!!This is BlackJack!!!")
  println("---------------------")
  val playerCount : Int = readLine("Anzahl der Spieler: ").toInt

  val scoreboard = Scoreboard(playerCount)
  val controller = Controller(Game(scoreboard, playerList = List[Player](), gameDeck = Deck(), 0 ))
  val tui = TUI(controller)
  controller.notifyObservers()

  println("Starting the TUI: " + tui.eol)
  tui.inputLoop(controller.game)

