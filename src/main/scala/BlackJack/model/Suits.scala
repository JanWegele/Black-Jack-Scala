package BlackJack
package model


object Suits extends Enumeration {

  type Suit = Value

  val Spade = Value("\u2660")
  val Club = Value("\u2663")
  val Heart = Value("\u2665")
  val Diamond = Value("\u2666")


  val suits = List(Spade, Club, Heart, Diamond)

}


