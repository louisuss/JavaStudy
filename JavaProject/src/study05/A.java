package study05;

public class A {
    A(){}
    class B {
        B(){}
        int field1;
        void method1(){}
    }
    static  class C {
        C() {}
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
    }
    void method(){
        class D {
            D() {}
            int field1;
            void method1(){}
        }
        D d = new D();
        d.method1();
    }
}
