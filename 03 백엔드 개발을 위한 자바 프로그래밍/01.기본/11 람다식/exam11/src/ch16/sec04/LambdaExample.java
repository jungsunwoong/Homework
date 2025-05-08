package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개인 경우
        person.action((x,y)-> {
            double result = x+y;
//            System.out.println("결과 : " + result);
            return result;
        });
        // sum 메소드를 호출
        person.action((x,y)->{
            double result = sum(x,y);
            return result;
        });
    }
    public static double sum (double x, double y){
        return (x+y);
    }
}
