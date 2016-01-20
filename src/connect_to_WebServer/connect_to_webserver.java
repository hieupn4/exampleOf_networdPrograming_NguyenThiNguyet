/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_to_WebServer;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * dùng socket để kết nối với webserver của trang javatutorial qua cổng 80
 * @author PhamNgocHieu
 */
public class connect_to_webserver {
   public static void main(String[] args) throws IOException {       
        
                Socket theSocket = new Socket("www.javatutorial.com", 80);
                System.out.println("Connected to "
                        + theSocket.getInetAddress()
                        + " on port " + theSocket.getPort() + " from port "
                        + theSocket.getLocalPort() + " of "
                        + theSocket.getLocalAddress());            
        } // end for
    } // end main 

