package ch15.sec05.exam04;
import java.util.*;

public class Fruit implements Comparable<Fruit> {
    public String name;
    public int price;


    public Fruit(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name : " + name + " price : " + price;
    }

    @Override
    public int compareTo(Fruit otherFruit) {
        return Integer.compare(this.price,otherFruit.price);
    }
}
