package com.atguigu.bigdata.java;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Net_Client {

    public static void main(String[] args) throws IOException {
        //在本地建立客户端，往端口号9999发送数据
        Socket socket = new Socket("localhost",9999);
        //发送数据
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        User05 user = new User05();
        user.name = "加油！加油！";
        objectOutputStream.writeObject(user);
        System.out.println("以发送成功");
        socket.close();
    }
}
