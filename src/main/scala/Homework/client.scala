package Homework

import java.io.ObjectOutputStream
import java.net.{ServerSocket, Socket}

object client {
  def main(args: Array[String]): Unit = {
    //获取客户端
    val socket = new Socket("localhost",9999)
    //获取对象流
    val objectOutputStream = new ObjectOutputStream(socket.getOutputStream())
    //发送函数对象
    objectOutputStream.writeObject(User.test _)
    //打印
    println("发送成功")

    //接收来自服务端的反馈
    val in = socket.getInputStream
    //读取结果
    val result = in.read()
    println(result)
    //流关闭
    socket.close()







  }
}
