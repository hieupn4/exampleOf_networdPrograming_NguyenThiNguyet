/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_connect_to_server_2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * đoạn mã này thử nghiệm chương trình trong trường hợp Client sẽ gửi dữ liệu lên server theo vòng lặp
 * nó sẽ gửi 5 lần theo như vòng lặp for
 * cứ mỗi lần như vậy nó phải tạo ra một socket mới 
 * @author PhamNgocHieu
 */
public class client {
    public static void main(String[] args) throws IOException
            {              
                ObjectOutputStream stream1;
                for (int i = 0; i < 5; i++) {
                    Socket socket = new Socket("localhost", 2016);//nếu đặt khai báo socket này ngoài vòng lặp thì nó chỉ gửi được thông tin tới server 1 lần mà thôi
                    stream1 = new ObjectOutputStream(socket.getOutputStream());
                    stream1.writeObject("heloo vinh "+i);
                    socket.close();
                }
                    
                
            }
    
}
