package ch06.sec07.exam05;

public class Car {// 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){
        this.model="승합차";
        this.color="골든옐로우";
        this.maxSpeed=360;
    };
    Car(String model) {
    this(model, "골든옐로우", 360);
    }
    Car(String model, String color) {
        this(model, color, 360);
    }
    Car(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
//
//    public static void main(String[] args) {
//        Car car1 = new Car("자가용");
//        System.out.println(car1.color); // 형광색
//        System.out.println(car1.maxSpeed); // 300
//    }
}

