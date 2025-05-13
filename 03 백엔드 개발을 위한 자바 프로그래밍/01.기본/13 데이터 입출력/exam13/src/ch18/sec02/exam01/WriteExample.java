package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = 30;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("c:/temp/test1.db");

            fileOutputStream.write(a);
            fileOutputStream.write(b);
            fileOutputStream.write(c);

            fileOutputStream.close();

            System.out.println("파일 저장 완료");
        }
        catch (IOException e){
            e.printStackTrace();

        }

    }
}