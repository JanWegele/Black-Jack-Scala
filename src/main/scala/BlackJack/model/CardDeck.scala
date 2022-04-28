package BlackJack.model

import scala.util.Random

object CardDeck extends App {

  sealed abstract class Suit

  case object Spade extends Suit

  case object Heart extends Suit

  case object Club extends Suit

  case object Diamond extends Suit

  sealed abstract class Rank

  case object Two extends Rank

  case object Three extends Rank

  case object Four extends Rank

  case object Five extends Rank

  case object Six extends Rank

  case object Seven extends Rank

  case object Eight extends Rank

  case object Nine extends Rank

  case object Ten extends Rank

  case object Jack extends Rank

  case object Queen extends Rank

  case object King extends Rank

  case object Ace extends Rank

  val suits = Set(Spade, Heart, Club, Diamond)
  val ranks = List(Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace)

  case

  class Card(rank: Rank, suit: Suit)

  class Deck(pCards: List[Card] = for (r <- ranks; s <- suits) yield Card(r, s)) {
    val cards: List[Card] = if (isValidDeck(pCards)) pCards
    else throw new RuntimeException("Deck is invalid")

    def shuffle() = new Deck(Random.shuffle(cards))

    def pullFromTop(): (Card, Deck) = (cards.head, new Deck(cards.tail))

    def addToTop(card: Card) = new Deck(card :: cards)

    private def isValidDeck(cards: List[Card]) = cards.size <= 52 && cards.distinct.size == cards.size
  }
}
