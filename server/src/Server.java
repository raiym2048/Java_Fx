

import java.io.*;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException{
        try (ServerSocket server = new ServerSocket(9000)){
            System.out.println("Server started!");
            while(true){
                try (Phone phone = new Phone(server)){
                    String request = phone.readLine();
                    System.out.println("request length: " + request.length());
                    String response = (int)(Math.random() * 30 - 10)+ "";
                    System.out.println("Response: " + response);
                }
                catch (NullPointerException e){
                    e.printStackTrace();
                }
            }

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
