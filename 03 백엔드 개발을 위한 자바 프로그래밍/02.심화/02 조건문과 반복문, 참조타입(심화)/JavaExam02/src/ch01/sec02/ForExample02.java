package ch01.sec02;

public class ForExample02 {
    public static void main(String[] args) {
          String stars = "*****";
        for (int i = 5; i >= 0; i--) {
            String star = stars.substring(i) ;
            System.out.println(star);
        }
        for (int i = 0; i <=5; i++){
          String star = stars.substring(i);
          System.out.println(star);

        }
    }
}
