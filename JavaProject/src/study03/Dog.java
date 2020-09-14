package study03;

public class Dog extends Animal {
    public Dog() {
        this.kind = "mamel";
    }

    @Override
    public void sound() {
        System.out.println("Mung");
    }
}
