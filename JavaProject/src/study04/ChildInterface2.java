package study04;

public interface ChildInterface2 extends ParentInterface {
    @Override
    default void method2() {
        System.out.println("RUN");
    }
    public void method3();
}
