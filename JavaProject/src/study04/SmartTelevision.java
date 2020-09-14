package study04;

public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void search(String url) {

    }
}
