package study09;

import java.util.function.Function;

public class FunctionAndThenExample {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;
        String city;

        functionA = m -> m.getAddress();
        functionB = a -> a.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new Member("Kim", "123", new Address("Korea", "Seoul"))
        );
        System.out.println("Living city: " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("Kim", "345", new Address("Korea", "Busan"))
        );
        System.out.println("Living city: " + city);
    }
}
