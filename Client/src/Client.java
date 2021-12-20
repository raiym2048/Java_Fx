/*
import Holostoi.Phone;
*/

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try (Phone phone = new Phone("127.0.0.1",9000)){
           phone.writeLine("");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
