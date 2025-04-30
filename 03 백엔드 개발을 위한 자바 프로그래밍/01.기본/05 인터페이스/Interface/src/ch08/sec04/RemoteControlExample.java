package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 rc
        RemoteControl rc;

        // 인터페이스 구현 - tv
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // 인터페이스 구현 - audio
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
