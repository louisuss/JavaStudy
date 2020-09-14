package study05;

public class Anonymous {
    RemoteControl f = new RemoteControl() {
        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }
    };
    void method3() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };
        localVar.turnOn();
    }
    void method4(RemoteControl rc) {
        rc.turnOn();
    }

    Person field = new Person() {
        void work() {
            System.out.println("WORK");
        }

        @Override
        void wake() {
            System.out.println("wake up at 6");
            work();
        }
    };
    void method1() {
        Person localVar = new Person() {
            void walk() {
                System.out.println("walk");
            }

            @Override
            void wake() {
                System.out.println("wake up at 7");
                walk();
            }
        };
        localVar.wake();
    }
    void method2(Person person) {
        person.wake();
    }
}
