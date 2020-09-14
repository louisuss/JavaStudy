package study06;

public class PeopleExample {
    public static void main(String[] args) {
        People original = new People(11, new int[] {90,90}, new Car("sonata"));
        People cloned = original.getPeople();
        cloned.scores[0] = 100;
        cloned.car.model = "genesis";

        System.out.println(original.car.model);
        System.out.println(original.scores[0]);
        System.out.println(cloned.car.model);
        System.out.println(cloned.scores[0]);
    }
}
