package ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOff();
    void turnOn();
    void setVolume(int volume);
}
