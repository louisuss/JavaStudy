package study03;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("Breathe");
    }
    public abstract void sound();
}
