package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        byte[] array = {10, 20, 30};

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("c:/temp/test2.db");

            fileOutputStream.write(array);

            System.out.println("파일이 저장되었습니다");

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
