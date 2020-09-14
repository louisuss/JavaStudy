package study03;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("Turn ON");
    }
    public void turnOff() {
        System.out.println("Turn Off");
    }
}
