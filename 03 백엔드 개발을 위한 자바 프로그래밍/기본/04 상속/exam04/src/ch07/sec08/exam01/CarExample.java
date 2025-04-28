package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        Tire  myTire = new Tire();
//        myTire.roll();
//        myTire = new HankookTire();
//        myTire.roll();
//        myTire = new KumhoTire();
//        myTire.roll();

          Car myCar = new Car();
          myCar.tire = new Tire();
          myCar.run();

          myCar.tire = new HankookTire();
          myCar.run();

          myCar.tire = new KumhoTire();
          myCar.run();

    }
}
