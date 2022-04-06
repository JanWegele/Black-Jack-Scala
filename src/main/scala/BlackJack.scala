@main def hello(): Unit =
  println("!!This is BlackJack!!")
  println(mesh)

val eo1: String = sys.props("line.separator")

val widthDefault: Int = 60
val lengthDefault: Int = 5
val widthCard: Int = 4

def space() = " "

//-------------------------------------------------/Table
//Table width
def width(width: Int): Int =
  if(width<3){
    width
  }else {
    widthDefault
  }


val widthParam: Int = width(3)


//Table default methods
def tableWidth(): String =
  "+" + ("-" * widthDefault) + "+" + eo1
def cells(): String =
  "|" + space()*widthDefault + "|" + eo1


//Table method overloading
def tableWidth(width: Int): String =
  "+" + ("-" * width) + "+" + eo1
def cells(width: Int): String =
  "|" + space()*width + "|" + eo1


//Table length
def length(length: Int): Int =
  if(length<0){
    length
  }else {
    lengthDefault
  }

val lengthParam: Int = length(-1)


//-------------------------------------------------/Card
//making card scalable with table size
def widthForCard(width: Int): Int =
  ((width-(widthCard+2))*0.5).toInt


//Card size should not be scalable
val cardWidth: String =
  "+" + ("-"*widthCard) + "+"
val cardLength: String =
  "|" + (space()*widthCard) + "|"



//-------------------------------------------------/Card and Table
//Fitting card on the table
def cardTotalWidth(width: Int): String =
  "|" + (space()*widthForCard(width)) + cardWidth + (space()*widthForCard(width)) + "|" + eo1

def cardTotalHeight(width: Int): String =
  "|" + (space()*widthForCard(width)) + cardLength + (space()*widthForCard(width)) + "|" + eo1

def cardTotal(width: Int): String =
  cardTotalWidth(width) + cardTotalHeight(width)*2 + cardTotalWidth(width)




//-------------------------------------------------/Mesh
//Putting Table and Card together
val mesh: String = tableWidth(widthParam) + cardTotal(widthParam) + cells(widthParam)*length(lengthDefault) + cardTotal(widthParam) + tableWidth(widthParam)
val meshDefault: String = tableWidth() + cardTotal(widthDefault) + cells()*length(lengthDefault) + cardTotal(widthDefault) + tableWidth()
