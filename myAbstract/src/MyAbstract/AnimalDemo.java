package MyAbstract;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a = new Animai();   //抽象类不能创建对象 ，需要以多态的方式创建
        Animal a = new Cat();
        a.setName("uu");
        a.setAge(18);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
//        a.show();

        a= new Cat("ii",10);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}
