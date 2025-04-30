package ch07.sec03.exam02;

public class Phone {
    //field 속성 값
    public String model ;
    public String color;

    //생성자 매개변수 초기화
    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }



}
