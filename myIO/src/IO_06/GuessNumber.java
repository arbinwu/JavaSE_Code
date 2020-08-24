package IO_06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {

    }

    public static void start() {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("你猜的大了");
            }else if (guessNumber < number) {
                System.out.println("你猜的小了");
            } else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
    }
}
