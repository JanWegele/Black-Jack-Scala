package BlackJack

import BlackJack.view.TUI
import scala.io.StdIn.readLine

@main def hello(): Unit =
  println("!!This is BlackJack!!")
  println("---------------------")
  val playerCount : Int = readLine("Anzahl der Spieler: ").toInt
  val tui = new TUI(playerCount)

  println(tui.print(playerCount))

