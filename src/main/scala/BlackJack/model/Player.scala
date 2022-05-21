package BlackJack
package model

case class Player(name: String, playerScore: Int, playerDeck: Deck) {
  val eol: String = sys.props("line.separator")

  def changeScore(score: Int): Int = {
    score
  }


  def addToDeck(card: Card): Deck = {
    playerDeck.addToTop(card)
  }

  override def toString: String = this.name // + "\t" + this.playerScore + "\t" + this.playerDeck.getDeckAsString
}

//case class Dealer(name : String, playerScore : Int, playerDeck : Deck) extends defaultPlayer
