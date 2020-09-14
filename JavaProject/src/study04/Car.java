package study04;

public class Car {
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new KumhoTire(),
            new KumhoTire(),
    };
    void run() {
        for(Tire tire: tires) {
            tire.roll();
        }
    }
}
