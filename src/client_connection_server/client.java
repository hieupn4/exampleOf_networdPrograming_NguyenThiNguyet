/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_connection_server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Mình đang code thử sự kết nối của CLient và Server
 * @author PhamNgocHieu
 */
public class client {
    public static void main(String[] args) throws IOException, ClassNotFoundException
            {
                Socket x = new Socket("localhost",1989);
                ObjectOutputStream stream1 = new ObjectOutputStream(x.getOutputStream());
                stream1.writeObject("server ơi anh yêu em");
                ObjectInputStream stream2 = new ObjectInputStream(x.getInputStream());
                System.out.println("Client nhận được từ server nội dung là : "+stream2.readObject().toString());
            }
}
