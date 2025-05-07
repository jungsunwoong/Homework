package ch15.sec05.exam03;


import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("홍길동",35));
        persons.add(new Person("감자바",25));
        persons.add(new Person("박지원",31));

        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println(person);
        }


    }
}
