package study05;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.wake();
        anony.method1();
        anony.method2(new Person() {
            void study() {
                System.out.println("study");
            }

            @Override
            void wake() {
                System.out.println("wake up at 8");
                study();
            }
        });
    }
}
