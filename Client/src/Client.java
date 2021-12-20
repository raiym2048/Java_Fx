import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
        try (Socket socket = new Socket("127.0.0.1",9000);
             BufferedWriter writer =
                     new BufferedWriter(
                             new OutputStreamWriter(
                                     socket.getOutputStream()));
             BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(
                                     socket.getInputStream()));
        ){
            System.out.println("Connected to server!");
            String request = "Message: ";
            writer.write(request);
            writer.newLine();
            writer.flush();

            String response = reader.readLine();
            System.out.println("response: " + response);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
