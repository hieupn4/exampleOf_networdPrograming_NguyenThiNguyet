/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_last_modify_File;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;

/**
 * lấy thông tin của thời gian lần cuối cùng của một file nào đó trên server được sửa đổi
 * @author PhamNgocHieu
 */
public class check_last_modify {
    public static void main(String[] argv) 
   throws Exception {
    /*  URL u = new URL("http://thethao.vnexpress.net/photo/giai-ngoai-hang-anh/vong-21-ngoai-hang-anh-bao-tap-cho-arsenal-tai-anfield-3341430.html");
      URLConnection uc = u.openConnection();
      uc.setUseCaches(false);// không sử dụng cache
      long timestamp = uc.getLastModified();
      System.out.println("The last modification time of java.bmp is :"+timestamp); */
       /* InetAddress add = InetAddress.getLocalHost();
        System.out.println(add);*/
       /* InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface x =NetworkInterface.getByInetAddress(ip);
        System.out.println("Ip: "); */
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Current IP address : " + ip.getHostAddress());

        NetworkInterface network = NetworkInterface.getByInetAddress(ip);

        byte[] mac = network.getHardwareAddress();
        

        System.out.print("Current MAC address : ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) 
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        System.out.println("Current MAC address : " + sb);
        System.out.print(network.getDisplayName());
        
        
   
    
}}
