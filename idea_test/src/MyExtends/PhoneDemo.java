package MyExtends;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("jack");

        System.out.println("------------");
        NewPhone np = new NewPhone();
        np.call("jack");
    }
}
