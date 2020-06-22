package Homework

import java.io.ObjectInputStream
import java.net.{ServerSocket, Socket}

object server {
  def main(args: Array[String]): Unit = {
      //建立通信
      val serverSocket = new ServerSocket(9999)
     //接收客户端对象
      val accept = serverSocket.accept()
     //创建对象流
      val objectInput = new ObjectInputStream(accept.getInputStream());
      //接收到的类型转化为函数类型
      val user = objectInput.readObject().asInstanceOf[(Int)=>Int]
    //计算结果
      val result = user(2)

    //给客户端反馈
      val out = accept.getOutputStream
      out.write(result)
      println("反馈成功")




  }
}
