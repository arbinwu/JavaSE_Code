package lambda_06;

public class LambdaDemo {
    public static void main(String[] args) {
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("interface");
            }
        });

        useInter(() -> System.out.println("Lambda interface")); //接口可以使用lambda,必须只有一个抽象方法;有多个方法的需要使用内名内部类

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("animal");
            }
        });

//        useAnimal(()-> System.out.println("animal")); //抽象类不能使用lambda

        useStudent(new Student() {
            @Override
            public void study() {
                System.out.println("good good study");
            }
        });

//        useStudent(() -> System.out.println("study")); //具体类不能使用lambda

    }

    private static void useStudent(Student s) {
        s.study();
    }

    private static void useInter(Inter i) {
        i.show();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }
}
