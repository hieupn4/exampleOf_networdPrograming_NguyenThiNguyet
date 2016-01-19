/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get_MAC_address_in_JAVA;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * đây là một thí nghiệm để xác định địa chỉ MAC của card mạng trên máy mình là gì.
 * chú ý rằng trên máy tính của mình ( thực ra là card mạng) thì có một thứ địa chỉ duy nhất không thay
 * đổi là địa chỉ MAC
 * @author PhamNgocHieu
 */
public class experience {
    public static void main(String[] args) throws UnknownHostException, SocketException
    {
        InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);
        byte[] mac = network.getHardwareAddress();        
        System.out.print("Current MAC address : ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) 
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        System.out.println("Current MAC address : " + sb);
    }
}
