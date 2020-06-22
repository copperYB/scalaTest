package exercise

object exercise0519 {
  def main(args: Array[String]): Unit = {
//    val b : Byte = 1
//    val s : Short = b
//    val i : Int = s
//    val str : String = null
//
//    val an : Any = "454"
//
//    val sd : Int = 1
//    val ert : Short = sd.toShort
//
//    val stre : String = "Hello" + ert
//    val i : Int = 20
//    val the : Int = i . + (2)
//    println(the)
    val age : Int = 30

    val result = if(age > 20){
      "青年"
    }
    //println(result)

//    for(i <- 1 to 5 by 2 ){
//      print(i)
//    }

//    for(i <- 1 until 6 by 2 ){
//      println(i)
//    }

    for( i <- Range(1,5)){
      println(i)
    }

    for(i <- Range(1,5); j = i + 1){
      println(j)
    }

  }
}
