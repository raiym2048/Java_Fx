import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException{
        try (ServerSocket server = new ServerSocket(9000)){
            System.out.println("Server started!");
            while(true){
                try (Socket socket = server.accept();
                     BufferedWriter writer = new BufferedWriter(
                             new OutputStreamWriter(socket.getOutputStream()));
                     BufferedReader reader = new BufferedReader(
                             new InputStreamReader(socket.getInputStream())
                     )
                ){
                    String request = reader.readLine();
                    System.out.println("request length: " + request.length());
                    writer.write("writer request: "+request);

                    writer.newLine();
                    writer.flush();
                }
            }

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
