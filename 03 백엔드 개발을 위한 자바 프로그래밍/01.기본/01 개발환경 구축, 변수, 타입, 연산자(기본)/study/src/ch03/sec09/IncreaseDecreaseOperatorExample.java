package ch03.sec09;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x= " + x); //12
        System.out.println("-----------------");

        y--;
        --y;
        System.out.println("y= " + y); //8
        System.out.println("-----------------");

        z=x++; // z=12 x=13
        System.out.println("z= " + z); //12
        System.out.println("x= " + x); //13
        System.out.println("-----------------");

        z = ++x + y++; // z= 14 + 8 = 22 x=14 y=9
        System.out.println("z= " + z); // 22
        System.out.println("x= " + x); // 14
        System.out.println("y= " + y); // 9
    }
}
