package study06;

import java.util.Arrays;

public class People implements Cloneable{
    public int age;
    public int[] scores;
    public Car car;

    public People(int age, int[] scores, Car car) {
        this.age = age;
        this.scores = scores;
        this.car = car;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 얕은 복제 실행
        People cloned = (People) super.clone(); // Object 의 clone 호출
        // 깊은 복제 실행
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        cloned.car = new Car(this.car.model);
        return cloned;
    }

    public People getPeople() {
        People cloned = null;
        try {
            cloned = (People)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
