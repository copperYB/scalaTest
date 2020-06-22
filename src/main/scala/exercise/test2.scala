package exercise

object test2 {
  def main(args: Array[String]): Unit = {
    val age = 20
    if(age > 18){
      println("hello")
    }else{
      throw new Exception
    }
  }

}
