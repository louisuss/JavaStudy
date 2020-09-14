package studyclass;

public class Service {
    @PrintAnnotation
    public void method1() {
        System.out.println("Running");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("Running2");
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3() {
        System.out.println("Running3");
    }
}
