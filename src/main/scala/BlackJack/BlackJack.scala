package BlackJack

import java.io.BufferedReader
import BlackJack.view.TUI
import scala.io.StdIn.readLine

@main def hello(): Unit =
  println("!!This is BlackJack!!")
  println("---------------------")
  val playerCount : Int = readLine("Anzahl der Spieler: ").toInt
  
  val tui = new TUI(playerCount)

  println("Starting the TUI: "+tui.eol)
  tui.processInput(new BufferedReader(Console.in))

