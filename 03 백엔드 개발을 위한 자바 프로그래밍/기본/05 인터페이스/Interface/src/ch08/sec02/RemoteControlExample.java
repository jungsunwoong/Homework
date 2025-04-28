package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 변수에 인터페이스 할당
        RemoteControl rc;

        // 인터페이스 구현1 - tv
        rc = new Television();
        rc.turnOn();

        // 인터페이스 구현2 - audio
        rc = new Audiot();
        rc.turnOn();
    }
}
