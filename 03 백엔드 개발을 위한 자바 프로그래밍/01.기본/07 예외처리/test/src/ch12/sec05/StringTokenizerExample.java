package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arrData1 = data1.split("&|,");
        for( String data : arrData1 ) {
            System.out.println(data);
        }
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st1 = new StringTokenizer(data2, "/");
        for( ; st1.hasMoreTokens(); ) {
            String data = st1.nextToken();
            System.out.println(data);
        }
//        while(st1.hasMoreTokens()) {
//            String data = st1.nextToken();
//            System.out.println(data);
//        }

    }

}
