package com.java.sample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketClientExample {
    public static void main(String[] args) {
        try (
             Socket socket = new Socket("localhost", 9090);
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            String messageReceived = "", messageSend = "";

            while(true){
                messageSend = br.readLine();
                out.writeUTF(messageSend);
                out.flush();
                if (messageSend != null && messageSend.equals("exit")) {
                    break;
                }
                messageReceived = in.readUTF();
                System.out.println("Server says:" + messageReceived);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
