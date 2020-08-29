package lambda_04;

public class LambdaDemo {
    public static void main(String[] args) {
        useAddable((int a, int b) -> {
            return a + b;
        });
        //参数的类型可以省略; 有多个参数的情况下，不能只省略一个，需要统一省略或者不省略
        useAddable((a,b)-> {
            return a + b;
        });

        //如果参数只有一个，小括号可以省略
        useFly(s -> {
            System.out.println(s);
        });

        //如果代码块的语句只有一条，可以省略大括号和分号
        useFly(s -> System.out.println(s));

        //如果代码块的语句只有一条，可以省略大括号和分号，如果有return，return也要省略
        useAddable((x,y)-> x + y);

    }

    private static void useFly(Flyable f) {
        System.out.println("飞机");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
