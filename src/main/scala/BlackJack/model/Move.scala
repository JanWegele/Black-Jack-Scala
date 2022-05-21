package BlackJack
package model

trait Move {
  def doStep(game: Game): Game
}

//case class DrawCard() extends Move{
//  override def doStep(game: Game): Game =
//}
//case class AddPlayer() extends Move :
//  override doStep(game: Game): Game = game.copy()

