package BlackJack

import java.io.BufferedReader
import BlackJack.aview.TUI
import BlackJack.controller.Controller
import BlackJack.model.{Deck, Game, Grid, Player, Card}

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

@main def hello(): Unit =
  println("!!This is BlackJack!!!")
  println("---------------------")
  val playerCount : Int = readLine("Anzahl der Spieler: ").toInt
  val controller = Controller(Game(playerList = List[Player](), gameDeck = Deck(List[Card]()), 0, playerCount))
  val tui = TUI(controller)
  controller.notifyObservers()

  println("Starting the TUI: " + tui.eol)
  tui.inputLoop(controller.game)

