package study10;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ID and PWD");
            System.out.println("ID: ");
            String id = scanner.nextLine();

            System.out.println("PWD: ");
            String pwd = scanner.nextLine();
            System.out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pwd)) {
                    System.out.println("Logged in");
                    break;
                } else {
                    System.out.println("PWD Incorrect");
                }
            } else {
                System.out.println("ID Incorrect");
            }
        }
    }
}
