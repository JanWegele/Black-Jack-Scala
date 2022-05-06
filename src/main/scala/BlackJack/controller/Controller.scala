package BlackJack
package controller

import model.{Deck, Game, Move, Player, Scoreboard}
import util.Observable


case class Controller(var game: Game) extends Observable {

  def doAndPublish(doThis: Move => Game, create: Move): Unit =
    game = doThis(create)
    notifyObservers()

  def put(move: Move): Game = move.doStep(game)

  def createPlayer(name: String): Player = Player(name, Deck(), 0)
}

