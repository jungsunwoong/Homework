package ch15.sec05.exam04;

import java.util.*;

public class FruitComparator {
    public static void main(String[] args) {

    List<Fruit> fruits = new ArrayList<>();
    fruits.add(new Fruit("포도",3000));
    fruits.add(new Fruit("수박",10000));
    fruits.add(new Fruit("딸기", 6000));

//    Collections.sort(fruits);
//
//    for(Fruit f : fruits){
//        System.out.println(f);
//    }
        Collections.sort(fruits, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o2,Fruit o1) {
                return Integer.compare(o1.price, o2.price);
            }
        });
        for(Fruit f : fruits){
            System.out.println(f);
        }
    }
}
