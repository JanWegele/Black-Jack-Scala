package BlackJack
package controller

import model.{Card, Deck, Game, Move, Player}
import util.Observable
import scala.Option


case class Controller(var game: Game) extends Observable {

  def doAndPublish(doThis: Move => Game, create: Move): Unit =
    game = doThis(create)
    notifyObservers()

  def put(move: Move): Game = move.doStep(game)

  def createPlayer(name: String): Player = Player(name, 0, Deck())

}

