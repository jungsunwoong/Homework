package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        //parent methode2 는 child methode2 로 재정의 되었다 (오버라이드)
//        parent.method3();
        // parent 클래스에는 method3 이 정의되어 있지 않다
        // method3 은 Child 클래스에 정의되어 있고 올바르게 고치면
        child.method3();
        //이다.
    }
}
