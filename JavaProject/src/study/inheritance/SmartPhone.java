package study.inheritance;

public class SmartPhone  extends CellPhone{
    int channel;

    SmartPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnTV(){}
    void changeChannel(int channel){
        this.channel = channel;
    }
    void turnOffTv(){}
}
