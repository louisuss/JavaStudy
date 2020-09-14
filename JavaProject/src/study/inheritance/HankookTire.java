package study.inheritance;

public class HankookTire extends Tire {
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println("Hankook");
            return true;
        } else {
            return false;
        }
    }
}
