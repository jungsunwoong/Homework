package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {
        byte[] data = new byte[100];

        try{
            FileInputStream fileInputStream = new FileInputStream("c:/temp/test2.db");
            int bytesRead = fileInputStream.read();

            while((bytesRead = fileInputStream.read(data)) != -1){
                for (int i=0; i< bytesRead;i++){
                    System.out.println(data[i]);
                }
            }
            fileInputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
