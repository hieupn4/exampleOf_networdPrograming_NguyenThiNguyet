package client_con_; 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class ClientProcess {
     
    private Socket socket = null;
     
    public ClientProcess(String hostAddress, int port){
        try {
            socket = new Socket(hostAddress, port);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public boolean sendMSG(Object msg){
         
        if(socket == null)
            return false;
         
        try {
            ObjectOutputStream stream = new ObjectOutputStream(socket.getOutputStream());
            stream.writeObject(msg);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
 
    public Object receiveMSG(){
         
        try {
            ObjectInputStream stream = new ObjectInputStream(socket.getInputStream());
            try {
                return stream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        return null;
    }
     
    public static void main(String args[]){
        // thực hiện kết nối tới máy chủ có địa chỉ là localhost theo cổng 345
        ClientProcess client = new ClientProcess("localhost", 9999);
        client.sendMSG(new String("chao cac ban")); // gửi thông tin cho server
        String s = (String) client.receiveMSG(); // nhận thông tin phản hồi từ server
        System.out.printf("Đã nhận một xâu từ máy chủ: " + s);
    }
         
}