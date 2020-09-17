package study10;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(81));
        scores.add(new Integer(89));

        Integer score = null;

        score = scores.first();
        System.out.println(score);
        score = scores.last();
        System.out.println(score);
        score = scores.lower(new Integer(95));
        System.out.println(score);
        score = scores.higher(new Integer(80));
        System.out.println(score);
        score = scores.floor(new Integer(95));
        System.out.println(score);
        score = scores.ceiling(new Integer(85));
        System.out.println(score);

        while (!scores.isEmpty()) {
            score = scores.pollFirst();
            System.out.println(score + " " + scores.size());
        }
    }
}
