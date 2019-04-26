package com.artgeektech.iocdemo;

import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class JavaReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {

        System.out.println("Demo of Java Reflection\n");

        Class<?> engineClass = Class.forName("com.artgeektech.iocdemo.tesla.engine.Engine");
        Annotation[] engineClassAnnotations = engineClass.getAnnotations();

        for (Annotation annotation: engineClassAnnotations) {
            if (annotation instanceof Component) {
                System.out.println("Use reflection to create a Engine instance...\n");
                Object engineBean = engineClass.newInstance();
                System.out.println(engineBean);
//                 IoCContainer.add(engineBean);
//                Constructor<?> constructor = engineClass.getConstructor();
                //IocContainer.initialize()
            }
        }

//        Class c1 = EmployeeRestController.class;
//        Annotation[] annotations = c1.getAnnotations();
//        for (Annotation annotation: annotations) {
//            if (annotation instanceof Component) {
//                System.out.println("IoC Container will control its initialization...\n");
//                // IoC Container logic....
//            } else if (annotation instanceof RestController) {
//                Method[] methods = c1.getMethods();
//                for (Method method: methods) {
//                    System.out.println("method in " + c1.getSimpleName() + " " + method.getName());
//                    Annotation annotation1 = method.getAnnotation(RequestMapping.class);
//                    if (annotation1 != null) {
//                        RequestMapping requestMapping = (RequestMapping) annotation1;
//                        System.out.println(requestMapping.method());
//                    }
//                    Annotation[] methodAnnotations = method.getDeclaredAnnotations();
//                }
//            }
//        }
    }
}
