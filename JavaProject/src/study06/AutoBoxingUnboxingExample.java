package study06;

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        int value = obj;
        System.out.println("value: " + value);

        int result = obj + 100;
        System.out.println("result: " + result);

        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
