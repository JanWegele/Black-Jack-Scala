@main def hello(): Unit =
  println("!!This is BlackJack!!")
  println(mesh(25, 4))

val eo1: String = sys.props("line.separator")

val widthDefault: Int = 30
val lengthDefault: Int = 5
val widthCard: Int = 4

def space() = " "

//-------------------------------------------------/Table
//Table width
def widthCalc(width: Int): Int =
  if (width < 10) {
    widthDefault

  } else {
    if (width % 2 == 0) {
      width
    } else {
      width + 1
    }
  }

//Table length
def lengthCalc(length: Int): Int =
  if (length < 0 || length > 10) {
    lengthDefault
  } else {
    length
  }


//Table default methods
def tableWidth(): String =
  "+" + ("-" * widthDefault) + "+" + eo1
def cells(): String =
  "|" + space() * widthDefault + "|" + eo1


//Table method overloading
def tableWidth(width: Int): String =
  val tWidth: Int = widthCalc(width)
  "+" + ("-" * tWidth) + "+" + eo1
def cells(width: Int): String =
  val tWidth: Int = widthCalc(width)
  "|" + space() * tWidth + "|" + eo1


//-------------------------------------------------/Card
//making card scalable with table size
def widthForCard(width: Int): Int =
  val cWidth: Int = widthCalc(width)
  ((cWidth - (widthCard + 2)) * 0.5).toInt


//Card size should not be scalable
def cardWidth(): String =
  "+" + ("-" * widthCard) + "+"
def cardLength(): String =
  "|" + (space() * widthCard) + "|"


//-------------------------------------------------/Card and Table
//Fitting card on the table
def cardTotalWidth(width: Int): String =
  val widthTotal: Int = widthCalc(width)
  "|" + (space() * widthForCard(widthTotal)) + cardWidth() + (space() * widthForCard(widthTotal)) + "|" + eo1

def cardTotalHeight(width: Int): String =
  val widthTotal: Int = widthCalc(width)
  "|" + (space() * widthForCard(widthTotal)) + cardLength() + (space() * widthForCard(widthTotal)) + "|" + eo1

def cardTotal(width: Int): String =
  val widthTotal: Int = widthCalc(width)
  cardTotalWidth(widthTotal) + cardTotalHeight(widthTotal) * 2 + cardTotalWidth(widthTotal)



//-------------------------------------------------/Mesh
//Putting Table and Card together
def mesh(width: Int, lengthT: Int): String =
  tableWidth(width) + cardTotal(width) + cells(width) * lengthCalc(lengthT) + cardTotal(width) + tableWidth(width)

val meshDefault: String = tableWidth() + cardTotal(widthDefault) + cells() * lengthCalc(lengthDefault) + cardTotal(widthDefault) + tableWidth()

