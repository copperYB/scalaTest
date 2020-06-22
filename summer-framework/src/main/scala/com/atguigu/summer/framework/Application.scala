package com.atguigu.summer.framework



class Application {

  /**
   * 启动应用
   * @t 参数类型： jdbc、file、hive、kafka 、 socket：severSocket
   */

  def start(t:String)(op: => Unit ): Unit ={
    //初始化环境
    println("环境初始化....")
    //业务逻辑
    try{
      op
    }catch{
      case ex: Exception => println("业务执行失败")
    }

    //环境关闭
    println("环境关闭....")
  }

}
