package client_connect_to_server;
import java.net.*;
import java.io.*;

public class server {

    public static void main(String[] args) {       
        for (int i = 0; i < 1; i++) {
            try {
                Socket theSocket = new Socket("www.javatutorial.com", 80);
                System.out.println("Connected to "
                        + theSocket.getInetAddress()
                        + " on port " + theSocket.getPort() + " from port "
                        + theSocket.getLocalPort() + " of "
                        + theSocket.getLocalAddress());
            } catch (UnknownHostException e) {
                System.err.println("I can't find " + args[i]);
            } catch (SocketException e) {
                System.err.println("Could not connect to " + args[i]);
            } catch (IOException e) {
                System.err.println(e);
            }
        } // end for
    } // end main
} // end getSocketInfo
