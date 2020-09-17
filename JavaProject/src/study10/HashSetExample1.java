package study10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("java");
        set.add("c++");
        set.add("c");
        set.add("java");

        int size = set.size();
        System.out.println(size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }
        set.remove("java");
        System.out.println(set.size());

        iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }
        set.clear();
        if (set.isEmpty()) {
            System.out.println("Empty");
        }
    }
}
