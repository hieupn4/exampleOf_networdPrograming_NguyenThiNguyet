package client_con_;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * mình đang thử tìm hiểu về cách kết nối giữa server và client
 * @author PhamNgocHieu
 */ 
public class ServerProcess {
    private Socket socket;
    private ServerSocket serverSocket;  
     
    public ServerProcess(int port){
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Kết nối thành công tới port " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }   
 
    }
 
 
    public Object receiveMSG(){
        try {
            socket = serverSocket.accept();     // lắng nghe kết nối từ đường truyền
            ObjectInputStream stream = new ObjectInputStream(socket.getInputStream()); // khởi tạo bộ đệm đọc
            try {
                return  stream.readObject();    // đọc dữ liệu từ bộ đệm
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
     
    public boolean sendMSG(Object msg){
         
        try {
            // khởi tạo bộ đệm ghi dữ liệu với đầu vào là bộ đệm của socket
            ObjectOutputStream stream = new ObjectOutputStream(socket.getOutputStream());
            stream.writeObject(msg);    // ghi dữ liệu lên bộ đệm của đường truyền
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
     
 
    public static void main(String args[]){
        // thực hiện khởi tạo lắng nghe kết nối từ cổng 345
        ServerProcess server = new ServerProcess(9999);
        String s =(String) server.receiveMSG(); // nhận thông tin từ Client
        System.out.printf("Đã nhận một xâu từ máy khách: " + s);
        server.sendMSG("Máy chủ đã nhận dữ liệu thành công"); // gửi thông tin cho Client
    }
}
