package study04;

public class Television implements RemoteControl {
    private int volume;
    private boolean mute;

    public void turnOn() {
        System.out.println("Turn On");
    }
    public void turnOff() {
        System.out.println("Turn Off");
    }
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Current Volume: " + volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if (mute) {

        } else {

        }
    }
}
