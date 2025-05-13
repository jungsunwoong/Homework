package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {

        try{
        FileInputStream fileInputStream = new FileInputStream("c:/temp/test1.db");
        int data;
        while((data = fileInputStream.read()) != -1){
            System.out.println(data);
        }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
