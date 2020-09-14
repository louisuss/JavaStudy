package study04;

public class MyClass {
    RemoteControl rc = new Television();

    MyClass(RemoteControl rc) {
        this.rc = rc;
    }

    void methodA() {
        RemoteControl rc = new Television();
    }
    void methodB(RemoteControl rc){}
}
