package BlackJack
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers.*

class CardSpec extends AnyWordSpec {
  val card1: Card = Card(Suit.Spade, Rank.Two)
  val card2: Card = Card(Suit.Spade, Rank.Three)
  val card3: Card = Card(Suit.Spade, Rank.Four)
  val card4: Card = Card(Suit.Spade, Rank.Five)
  val card5: Card = Card(Suit.Spade, Rank.Six)
  val card6: Card = Card(Suit.Spade, Rank.Seven)
  val card7: Card = Card(Suit.Spade, Rank.Eight)
  val card8: Card = Card(Suit.Spade, Rank.Nine)
  val card9: Card = Card(Suit.Spade, Rank.Ten)
  val card10: Card = Card(Suit.Spade, Rank.Jack)
  val card11: Card = Card(Suit.Spade, Rank.Queen)
  val card12: Card = Card(Suit.Spade, Rank.King)
  val card13: Card = Card(Suit.Spade, Rank.Ace)
  val card14: Card = Card(Suit.Heart, Rank.Two)
  val card15: Card = Card(Suit.Heart, Rank.Three)
  val card16: Card = Card(Suit.Heart, Rank.Four)
  val card17: Card = Card(Suit.Heart, Rank.Five)
  val card18: Card = Card(Suit.Heart, Rank.Six)
  val card19: Card = Card(Suit.Heart, Rank.Seven)
  val card20: Card = Card(Suit.Heart, Rank.Eight)
  val card21: Card = Card(Suit.Heart, Rank.Nine)
  val card22: Card = Card(Suit.Heart, Rank.Ten)
  val card23: Card = Card(Suit.Heart, Rank.Jack)
  val card24: Card = Card(Suit.Heart, Rank.Queen)
  val card25: Card = Card(Suit.Heart, Rank.King)
  val card26: Card = Card(Suit.Heart, Rank.Ace)
  val card27: Card = Card(Suit.Diamond, Rank.Two)
  val card28: Card = Card(Suit.Diamond, Rank.Three)
  val card29: Card = Card(Suit.Diamond, Rank.Four)
  val card30: Card = Card(Suit.Diamond, Rank.Five)
  val card31: Card = Card(Suit.Diamond, Rank.Six)
  val card32: Card = Card(Suit.Diamond, Rank.Seven)
  val card33: Card = Card(Suit.Diamond, Rank.Eight)
  val card34: Card = Card(Suit.Diamond, Rank.Nine)
  val card35: Card = Card(Suit.Diamond, Rank.Ten)
  val card36: Card = Card(Suit.Diamond, Rank.Jack)
  val card37: Card = Card(Suit.Diamond, Rank.Queen)
  val card38: Card = Card(Suit.Diamond, Rank.King)
  val card39: Card = Card(Suit.Diamond, Rank.Ace)
  val card40: Card = Card(Suit.Club, Rank.Two)
  val card41: Card = Card(Suit.Club, Rank.Three)
  val card42: Card = Card(Suit.Club, Rank.Four)
  val card43: Card = Card(Suit.Club, Rank.Five)
  val card44: Card = Card(Suit.Club, Rank.Six)
  val card45: Card = Card(Suit.Club, Rank.Seven)
  val card46: Card = Card(Suit.Club, Rank.Eight)
  val card47: Card = Card(Suit.Club, Rank.Nine)
  val card48: Card = Card(Suit.Club, Rank.Ten)
  val card49: Card = Card(Suit.Club, Rank.Jack)
  val card50: Card = Card(Suit.Club, Rank.Queen)
  val card51: Card = Card(Suit.Club, Rank.King)
  val card52: Card = Card(Suit.Club, Rank.Ace)

  "card1" should {
    "return card as string" in {
      card1.toString should be("♠2")
    }
  }
  "card2" should {
    "return card as string" in {
      card2.toString should be("♠3")
    }
  }
  "card3" should {
    "return card as string" in {
      card3.toString should be("♠4")
    }
  }
  "card4" should {
    "return card as string" in {
      card4.toString should be("♠5")
    }
  }
  "card5" should {
    "return card as string" in {
      card5.toString should be("♠6")
    }
  }
  "card6" should {
    "return card as string" in {
      card6.toString should be("♠7")
    }
  }
  "card7" should {
    "return card as string" in {
      card7.toString should be("♠8")
    }
  }
  "card8" should {
    "return card as string" in {
      card8.toString should be("♠9")
    }
  }
  "card9" should {
    "return card as string" in {
      card9.toString should be("♠10")
    }
  }
  "card10" should {
    "return card as string" in {
      card10.toString should be("♠J")
    }
  }
  "card11" should {
    "return card as string" in {
      card11.toString should be("♠Q")
    }
  }
  "card12" should {
    "return card as string" in {
      card12.toString should be("♠K")
    }
  }
  "card13" should {
    "return card as string" in {
      card13.toString should be("♠A")
    }
  }
  "card14" should {
    "return card as string" in {
      card14.toString should be("♥2")
    }
  }
  "card15" should {
    "return card as string" in {
      card15.toString should be("♥3")
    }
  }
  "card16" should {
    "return card as string" in {
      card16.toString should be("♥4")
    }
  }
  "card17" should {
    "return card as string" in {
      card17.toString should be("♥5")
    }
  }
  "card18" should {
    "return card as string" in {
      card18.toString should be("♥6")
    }
  }
  "card19" should {
    "return card as string" in {
      card19.toString should be("♥7")
    }
  }
  "card20" should {
    "return card as string" in {
      card20.toString should be("♥8")
    }
  }
  "card21" should {
    "return card as string" in {
      card21.toString should be("♥9")
    }
  }
  "card22" should {
    "return card as string" in {
      card22.toString should be("♥10")
    }
  }
  "card23" should {
    "return card as string" in {
      card23.toString should be("♥J")
    }
  }
  "card24" should {
    "return card as string" in {
      card24.toString should be("♥Q")
    }
  }
  "card25" should {
    "return card as string" in {
      card25.toString should be("♥K")
    }
  }
  "card26" should {
    "return card as string" in {
      card26.toString should be("♥A")
    }
  }
  "card27" should {
    "return card as string" in {
      card27.toString should be("♦2")
    }
  }
  "card28" should {
    "return card as string" in {
      card28.toString should be("♦3")
    }
  }
  "card29" should {
    "return card as string" in {
      card29.toString should be("♦4")
    }
  }
  "card30" should {
    "return card as string" in {
      card30.toString should be("♦5")
    }
  }
  "card31" should {
    "return card as string" in {
      card31.toString should be("♦6")
    }
  }
  "card32" should {
    "return card as string" in {
      card32.toString should be("♦7")
    }
  }
  "card33" should {
    "return card as string" in {
      card33.toString should be("♦8")
    }
  }
  "card34" should {
    "return card as string" in {
      card34.toString should be("♦9")
    }
  }
  "card35" should {
    "return card as string" in {
      card35.toString should be("♦10")
    }
  }
  "card36" should {
    "return card as string" in {
      card36.toString should be("♦J")
    }
  }
  "card37" should {
    "return card as string" in {
      card37.toString should be("♦Q")
    }
  }
  "card38" should {
    "return card as string" in {
      card38.toString should be("♦K")
    }
  }
  "card39" should {
    "return card as string" in {
      card39.toString should be("♦A")
    }
  }
  "card40" should {
    "return card as string" in {
      card40.toString should be("♣2")
    }
  }
  "card41" should {
    "return card as string" in {
      card41.toString should be("♣3")
    }
  }
  "card42" should {
    "return card as string" in {
      card42.toString should be("♣4")
    }
  }
  "card43" should {
    "return card as string" in {
      card43.toString should be("♣5")
    }
  }
  "card44" should {
    "return card as string" in {
      card44.toString should be("♣6")
    }
  }
  "card45" should {
    "return card as string" in {
      card45.toString should be("♣7")
    }
  }
  "card46" should {
    "return card as string" in {
      card46.toString should be("♣8")
    }
  }
  "card47" should {
    "return card as string" in {
      card47.toString should be("♣9")
    }
  }
  "card48" should {
    "return card as string" in {
      card48.toString should be("♣10")
    }
  }
  "card49" should {
    "return card as string" in {
      card49.toString should be("♣J")
    }
  }
  "card50" should {
    "return card as string" in {
      card50.toString should be("♣Q")
    }
  }
  "card51" should {
    "return card as string" in {
      card51.toString should be("♣K")
    }
  }
  "card52" should {
    "return card as string" in {
      card52.toString should be("♣A")
    }
  }

}
