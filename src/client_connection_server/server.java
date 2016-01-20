/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_connection_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * cái này là thử kết nối xem có được không 
 * @author PhamNgocHieu
 */
public class server {
    public static void main(String[] arg) throws IOException, ClassNotFoundException
            {
                Socket x = new Socket();
                ServerSocket y = new ServerSocket(1989);
                x = y.accept(); // đặt server ở trạng thái lắng nghe kết nối từ Client
                ObjectInputStream stream = new ObjectInputStream(x.getInputStream());
                String s = stream.readObject().toString();
                System.out.println("server nhan duoc thong tin tu client là : "+s);
                ObjectOutputStream stream2 = new ObjectOutputStream(x.getOutputStream());
                stream2.writeObject("Client ơi , em yêu anh ....");
            }
}
