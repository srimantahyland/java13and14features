package com.java.sample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExample {
    public static void main(String[] args)  {
        try (ServerSocket serverSocket = new ServerSocket(9090);
             Socket socket = serverSocket.accept();
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            String messageReceived = "", messageSend = "";

            while(true){
                messageReceived = in.readUTF();
                System.out.println("Client says:" + messageReceived);
                if (messageReceived != null && messageReceived.equals("exit")) {
                    break;
                }
                messageSend = br.readLine();
                out.writeUTF(messageSend);
                out.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
