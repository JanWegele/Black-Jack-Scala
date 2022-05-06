package BlackJack
package model

class Player(name : String) {
  
  var score = 0
  var playerDeck = new Deck()
  val eol: String = sys.props("line.separator")
//  playerDeck = playerDeck.shuffle()
  playerDeck.cards.clear()

  def playerScore(): String = {
    this.toString + "\t" + score +"\t"+ playerDeck.getDeckAsString + eol
  }

  def changeScore(score : Int): Unit = {
    this.score += score
  }

  def addToDeck(card: Card): Unit = {
    playerDeck.addToTop(card)
  }

  override def toString: String = this.name
}
