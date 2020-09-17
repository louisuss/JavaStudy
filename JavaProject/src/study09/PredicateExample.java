package study09;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student("Kim", "Man", 90),
            new Student("Kim", "Man", 80),
            new Student("Kim", "Man", 30)
    );
    public static double avg(Predicate<Student> predicate) {
        int cnt = 0, sum = 0;
        for (Student student :
                list) {
            if (predicate.test(student)) {
                cnt++;
                sum += student.getScore();
            }
        }
        return (double)sum/cnt;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals("Man"));
        System.out.println("Man Avg: " + maleAvg);

        double femaleAvg = avg( t -> t.getSex().equals("Female"));
        System.out.println("Female Avg: " + femaleAvg);
    }

}
