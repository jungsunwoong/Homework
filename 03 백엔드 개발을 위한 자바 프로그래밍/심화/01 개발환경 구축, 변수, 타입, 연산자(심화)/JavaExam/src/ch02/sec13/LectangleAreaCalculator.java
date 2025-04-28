package ch02.sec13;

public class LectangleAreaCalculator {
    public static void main(String[] args) {
    LectangleArea(5,10,7);
    }
    public static double LectangleArea(double width1, double width2, double height1) {
        double area = (double) (width1 + width2) * height1 / 2;
        System.out.println("사다리꼴의 넓이 : " + area);
        return area;
    }
}
