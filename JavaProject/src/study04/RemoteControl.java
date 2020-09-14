package study04;

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("MUTE");
        } else {
            System.out.println("Unmute");
        }
    }

    static void changeBattery() {
        System.out.println("Change battery");
    }
}
