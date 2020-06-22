package com.atguigu.bigdata.scala

import java.io.{File, FileWriter, PrintWriter}

import scala.io.{Source, StdIn}


//  object HelloScala {
//    def main(args: Array[String]): Unit = {
//      System.out.println("Hello Scala")
//      println("Hello Scala")
//    }
//  }

object HelloScala{
  def main(args: Array[String]): Unit = {
    /*
    var username : String = "zhangsan"
    val userpswd : String = "000000"
    username = "change"
    */
    /*
    类型推断
    var username = "zhangsan"
    val userpswd = "66666"
    println(username,userpswd)
     */
    //var name : String = "666"
    //printf("name = %s \n",name)
    //print("name" + name + "\n")
    //print(s"name = $name")
//    println(
//          s"""
//      | Hello
//      | ${name}
//      |""".stripMargin
//    )

//    val age : Int = scala.io.StdIn.readInt()
//    print(s"name=$age")

    val strings : Iterator[String] = Source.fromFile("input/test.txt").getLines()
    while(strings.hasNext){
      val able = strings.next()
      print(able)
    }


//        val writer = new PrintWriter( new File("output/text.txt"))
//
//    //val writer = new PrintWriter(new File("output/test.txt" ))
//    writer.write("Hello Scala")
//    writer.close()

//      val out = new PrintWriter(new File("output/test.txt"))
//      out.write("Hello Scala")
//      out.flush()
//      out.close()

//      var name : String = "sdfs"
//      name = "sddf"
//      print(name)



  }

}


