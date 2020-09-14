package studyclass;

import java.lang.reflect.Method;

public class PrintAnnotationsExample {
    public static void main(String[] args) {
        Method[] declareMethods = Service.class.getDeclaredMethods();

        for(Method method: declareMethods) {
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                System.out.println("[" + method.getName() + "] ");
                for (int i=0; i< printAnnotation.number();i++) {
                    System.out.println(printAnnotation.value());
                }
                System.out.println();

                try {
                    method.invoke(new Service());
                } catch (Exception e) {}
            }
        }
    }
}
