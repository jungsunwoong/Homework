package ch15.sec05.exam03;

import java.util.*;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    };


    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "name : " + name + " age : " + age;
    }
}
