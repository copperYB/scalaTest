package com.atguigu.bigdata.java;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net_Server {
    public static void main(String[] args) throws Exception {
        //建立服务，从端口9999接收数据
        ServerSocket serverSocket = new ServerSocket(9999);
        //接收客户端对象
        Socket accept = serverSocket.accept();
        ObjectInputStream objectInputStream = new ObjectInputStream(accept.getInputStream());
        User05 user05 = (User05) objectInputStream.readObject();
        System.out.println("接收到客户端发送的数据" + user05.name);

    }
}
