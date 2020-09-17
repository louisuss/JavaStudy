package study08;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Apple");
        Pair<Integer, String> p2 = new Pair<>(1, "Apple");
        boolean res1 = Util.<Integer, String>compare(p1, p2);
        if (res1) {
            System.out.println("equal");
        } else {
            System.out.println("differ");
        }

        Pair<String, String> p3 = new Pair<>("user1", "Kim");
        Pair<String, String> p4 = new Pair<>("user2", "Kim");
        boolean res2 = Util.compare(p3, p4);
        if (res2) {
            System.out.println("equal");
        } else {
            System.out.println("differ");
        }
    }
}
