/*
import Holostoi.PhoneDirectory.Phone;
*/

import PhoneDirectory.Phone;

import java.io.*;

public class Client {
    public static void main(String[] args){
        try (Phone phone = new Phone("127.0.0.1",9000)){
            System.out.println("Connected to server!");

            String request = "request!";
            System.out.println("the request is: " + request);

            phone.writeLine("the request is: "+request);
            String responce = phone.readLine();
            System.out.println("This is responce " + responce);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
