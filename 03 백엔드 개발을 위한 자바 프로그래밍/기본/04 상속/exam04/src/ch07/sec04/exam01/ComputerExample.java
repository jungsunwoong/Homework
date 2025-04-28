package ch07.sec04.exam01;

public class ComputerExample {

    public static void main(String[] args) {
        int r =10;
        Calculator cal = new Calculator();
        System.out.println(cal.areaCircle(r));;

        Computer comp = new Computer();
        System.out.println(comp.areaCircle(r));
    }

}
