package BlackJack
package model

trait Move {
  def doStep( game:Game ):Game
}

//case class DrawCard() extends Move{
//  override def doStep(game: Game): Game =
//}
