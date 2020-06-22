package com.atguigu.bigdata.scala

object Test0519 {
  def main(args : Array[String]) : Unit = {
    //println("test")

    /*
    数据类型简单介绍:
    pojo--->相当于bean对象
    scala引用类型和基本类型不能转换。
    java中两个类型没关系就不能互相转换，String和Interger
    抽取一个共同的any让其互相有关系
    scala的Null也是对象。
    nothing是anyval的子类型也是anyref的子类型，不确定什么值，就是nothing
    */
    //**********************************************************************
    /*

     */
    //anyval
    val b : Byte = 10
    val s : Short = 10
    val isd : Int = 10
    val l : Long = 10L
    val f : Float = 1.0f
    val sdd : Double = 1.0
    val c : Char = 'A'
    //默认int和double
    val i = 10
    val d = 10.0

    //Unit是一个类型，对象只有一个：()
    val u : Unit = ()
    //******************************************************************************
    //anyref ----> 引用类型

    //scala将null作为一个特殊的对象进行处理，类型就是Null
    val ssd = null

    //子类型可以代替父类型出现,null无法对int进行转换，anyval不能使用null赋值
    val sf : String = null

    // Nothing：没有值
    //Unit--->没有返回值（void）、nothing--->无值（exception）

    /*
    any后面可以是任何类型，不确定类型的时候可以用any
    any ---> anyref、any--->anyval
     */
        val dfsfd : Any = "123"
    //**************************************************************************

    /*
    隐式转换--->自动转换，Byte类型和Short类型之间没有关系，scala会自动隐式转换为Short类型
    和java不太一样，scala转换的是类型。

    如果精度大的转换为精度小的类型
    java--->截取
    scala--->方法转换  .toByte这种类型方法
     */
    val bb : Byte = i.toByte

    //常量运算在编译的时候就可以运行
    //val char : Char = 'A' + 1

    //任意类型都提供了和字符串进行拼接的方法，所有类型都提供了toString方法

    /*
    scala中的==就是java中的equals，比较的是内容，为了字符串的比较方便，eq是比较内存地址,
    一般比较字符串，别的对象也可以，对象中如果没有重写equals，他还是比较地址
    scala中的eq一般用于比较对象中的内存地址
    ==比较内容，类似于equals方法，并进行了非空判断
     */
    val q = new String("abc")
    val z = new String("abc")
    println(q == z)
    println(q.equals(z))
    println(q eq z)

    /*
    赋值运算符  Scala中没有++ -- 的操作，因为++ -- 有歧义
    什么叫赋值：将=右边的计算结果给左边叫赋值
    Scala中使用+=1的方式来代替++
     */
    //**********************************************************************
    /*
    逻辑运算符、位运算符
     */

    //scala是完全面向对象的语言，没有运算符
    /*
    我们的数字是数值类型的对象
     */
    1.to(2)
   // val i = 1.+(2)
    //重复出现的次数
    val str = "abc".*(2)


    /*
    分支控制：单分支 if 、双分支-->if else
     */
    //表达式是有返回值的，这个返回值取决于满足条件的最后一行代码的结果
    val age : Int = 10
    val result = if( age < 18){
      "青年"
    }else if( age < 20){
      "青少年"
      println("青年")  // 返回值是Unit ---- > ()
    }



    //面向对象必须都有结果，而且结果必须是对象，比如exception 他是没有返回值，所以是nothing来代替。

    /*
    Scala中没有三元运算符
    使用if else来代替
    如果大括号中的代码逻辑只有一行，那么可以省略的
     */

    //val s = if (age < 20) "zahngsan" else "lisi"

    //如果一行代码中只有一段逻辑，那么可以省略分号 ;  如果他有多段逻辑，分号不能省略
    //可以通过换行省略分号
    println("zhangsan");println("lisi")
    //****************************************************************************
    //循环控制
    //for循环
    /*
    1 to 5 ----> 1.to(5) --> (1,2,3,4,5) ---> 包含的概念
    <- 指向赋值的感觉
    没有声明类型，因为可以自动推断
     */
    for( i <- 1 to 5){
      println("i = " + i)
    }


    // 1 until 5 ---> 1.until(5) ---> [1,2,3,4,5)--->不包含5
    for( i <- 1 until 5){
      println("i = " + i)
    }


    //等同于until5
    for( i <- Range(1,5)){
      println("i = " + i)
    }

    // for循环默认情况下是一个一个循环，传三个参数，第三个参数是step---> 循环的幅度,by后面的数字也是step

    for( i <- Range(1,5,2)){
      println("i = " + i)
    }
    for( i <- 1 to 5 by 2){
      println("i = " + i)
    }




  }
}












