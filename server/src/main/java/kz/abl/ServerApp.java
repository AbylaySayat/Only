package kz.abl;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8189);
        System.out.println("Server run port 8189 waiting....");
        Socket socket =  serverSocket.accept();
        System.out.println("Клиент подключился");
        int x;
        while ((x= socket.getInputStream().read()) !=-1){
            System.out.print((char) x);
        }
        serverSocket.close();
    }
}
