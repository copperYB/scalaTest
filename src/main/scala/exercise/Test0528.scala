package exercise

import scala.beans.BeanProperty

object Test0528 {
  def main(args: Array[String]): Unit = {
    val test = new test

  }
  class test{
    @BeanProperty
    val name :String = "zhangsan"
  }

}
