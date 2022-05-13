package BlackJack
package model

case class Player(name : String, playerScore : Int, playerDeck : Deck) {
  val eol: String = sys.props("line.separator")
//  playerDeck = playerDeck.shuffle()

//  def playerScore(): String = {
//    this.toString + "\t" + score +"\t"+ playerDeck.getDeckAsString + eol
//  }

  def changeScore(score : Int): Int = {
    score

  }

  def addToDeck(card: Card): Deck = {
    playerDeck.addToTop(card)
  }

  override def toString: String = this.name
}
