package BlackJack

import BlackJack.aview.TUI
import BlackJack.controller.Controller
import BlackJack.model.*

import java.io.BufferedReader
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

@main def hello(): Unit =
  println("!!This is BlackJack!!!")
  println("---------------------")
  val playerCount: Int = readLine("Anzahl der Spieler: ").toInt
  val game : Game = Game(PlayerList(), Deck.apply("filled"), playerCount, 0 )
  val controller = Controller(game)
  val tui = TUI(controller)
  controller.notifyObservers()

  println("Starting the TUI: " + tui.eol)
  tui.inputLoop(controller.game)

