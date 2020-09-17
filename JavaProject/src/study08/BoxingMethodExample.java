package study08;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intVal = box1.get();

        Box<String> box2 = Util.boxing("Kim");
        String strVal = box2.get();
    }
}
