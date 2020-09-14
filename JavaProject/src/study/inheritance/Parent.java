package study.inheritance;

public class Parent {
    public String field1;

    public void method1() {
        System.out.println("Parent-method1");
    }
    public void method2() {
        System.out.println("Parent-method2");
    }
    public void method(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child)parent;
        }
    }
}
