package ch12.sec07;

import java.io.*;
import java.util.*;

public class RandomExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] randomNumbers = new int[]{Integer.parseInt(br.readLine())};
        Arrays.sort(randomNumbers);
        Random random = new Random();


    }
}
