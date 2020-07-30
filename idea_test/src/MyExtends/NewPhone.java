package MyExtends;

public class NewPhone extends Phone{
    @Override  //注解  说明是父类call方法的重写
    public void call(String name) {
        System.out.println("open");
//        System.out.println("call  " + name);
        super.call(name);
    }
}
