package ch12.sec07;

import java.util.Arrays;

public class Random {
    public int[] Random() {
        int[] random = new int[6];
        for(int i =0 ; i < 6; i++){
            random[i] = (int)(Math.random()*49+1);

        }
        Arrays.sort(random);
        System.out.println("당첨번호 : " + random.toString() );

        return random;
    }
}
