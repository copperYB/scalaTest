package exercise

import scala.io.StdIn
import scala.util.control.Breaks


object exercise0520 {
  def main(args: Array[String]): Unit = {
    //其他地方封装的功能称之为函数--->可以声明在任意地方，同时也可以嵌套
//    Breaks.breakable{
//      for(i <- 1 to 5){
//        if(i == 3){
//          Breaks.break()
//        }
//        println(i)
//      }
//
//    }
//    println("Come on")

//    def test(s:String) : Unit = {
//      return println(s)
//    }
//    test("5")


//    def fun1(): Unit ={
//      "函数体"
//    }
//    //fun1()
//
//    val f1 = fun1
//    val f2 = fun1 _
//    val f3 : ()=>Unit = fun1
//    println(f3)
//
//    println(f1)
//    println(f2)
//
//    def fun2(): String ={
//      "zhangsan" // 当函数有返回值时，可以将最后一行执行的代码作为返回结果，可以省略return
//    }
//    fun2()
//    println(fun2())
//
//    def fun3(name:String) : Unit = {
//        println(name)
//    }
//    fun3("加油")
//
//    def fun4(name:String): String ={
//      "Hello" + name
//    }
//    println(fun4("yangbo"))
//
//    def fun5(hello:String,name:String): Unit ={
//      print(hello + "" + name)
//    }
//    fun5("yangbo","jiayou")
//
//    def fun6(hello:String,name:String): String ={
//        hello + "" + name
//    }
//    println(fun6("yiding","niubi"))
//
//    def fun7(names:String*): Unit ={
//      println(names(1))
//    }
//    fun7("nihao","shenzhen")
//
//    def fun77(name:Int,names:String*): Unit ={
//      println(name)
//      println(names)
//    }
//    fun77(10,"zou","qi")
//
//    def fun8(name:String,password:String = "杨博"): Unit ={
//      println(name + "=" + password )
//    }
//    fun8("name")
//    fun8("name","超人")
//
//    def fun9(password:String = "000000",name:String): Unit ={
//      println(password+name)
//    }
//    fun9(name = "jiayou")
//
//    def fun11(): String ={
//      "zhangsan"
//    }
//
//    //逻辑只有一行
//    def fun12(): String = "zhangsan"
//
//    //可以推断出来，省略返回值类型
//
//    def fun13() = "试试啊"
//    println(fun13())
//
//    // 省略参数列表
//    def fun14 = "这也太简单了吧"
//    println(fun14)
//
//    //省略等号
//    def fun15(){
//      "zhangsan"
//    }
//
//    println(fun15())
//
//    val a = ()=>"hello "
//
//    println(()=>"hello")
//
//
//    def fun16(i:Int): Int ={
//      i * 2
//    }
//    def fun17(f:(Int)=>Int): Unit ={
//        f(20)
//    }

//    val age = 3
//    val f = if(age > 18){
//        println("hello")
//    }else{
//      throw new Exception
//    }
//     println(f)

    for(i <- 1 to 2 * 9 by 2; j = (17 - i)/2){
      println(" "* j + "*" * i)
    }
















  }



}
