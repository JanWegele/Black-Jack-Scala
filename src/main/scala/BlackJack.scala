@main def BlackJack(): Unit =
  println("!!This is BlackJack!!")
  println(mesh)

val eo1: String = sys.props("line.separator")

val width: Int = 100
val length: Int = 5
val cwidth: Int = 4
val cWidthtotal: Int = ((width-6)*0.5).toInt


def space() = " "

//Table
def tableWidth(): String =
  "+" + ("-" * width) + "+" + eo1
def cells(): String =
  "|" + space()*width + "|" + eo1

//Card

def cardWidth(): String =
  "+" + ("-"*cwidth) + "+"
def cardLength(): String =
  "|" + (space()*cwidth) + "|"

def cardTotalWidth(): String =
  "|" + (space()*cWidthtotal) + cardWidth() + (space()*cWidthtotal) + "|" + eo1
def cardTotalHeight(): String =
  "|" + (space()*cWidthtotal) + cardLength() + (space()*cWidthtotal) + "|" + eo1
def cardTotal(): String =
  cardTotalWidth() + cardTotalHeight()*2 + cardTotalWidth()


/*def cardMidTop(): String =
  ("|" + space() * 26 + "|" + space() + "|" + "/" + space() + "|" + space() * 26 + "|")
def cardMidBottom(): String =
  ("|" + space() * 26 + "|" + space() + "|" + "\\" + space() + "|" + space() * 26 + "|")
def card(): String =
  ("|" + space() * 26 + "+----+" + space() * 26 + "|" + eo1 + cardMidTop() + eo1 + cardMidBottom() + eo1 +
  "|" + space() * 26 + "+----+" + space() * 26 + "|" + eo1)*/


//Putting Table and Card together
val mesh: String = tableWidth() + cardTotal() + cells()*length + cardTotal() + tableWidth()
