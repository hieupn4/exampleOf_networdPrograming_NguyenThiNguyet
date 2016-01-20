/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_connect_to_server_2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * do CLient sẽ gửi thông tin đến server nhiều lần nên server sau khi nghe xong một bản tin
 * được gửi đến thì phải quay lại trạng thái nghe tiếp.
 * mà để nghe tiếp thì nó phải đặt trong một vòng while như sau
 * @author PhamNgocHieu
 */
public class server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket();
        ServerSocket server = new ServerSocket(2016);
       while (true) {
            socket = server.accept(); // chờ để khi client kết nối đến
            ObjectInputStream stream1 = new ObjectInputStream(socket.getInputStream());
            System.out.println("Dữ liệu từ CLient gửi đến : " + stream1.readObject().toString());
        }
    }

}
