//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.concurrent.TimeUnit;

public class TEST {
    public TEST() {
    }

    public static void main(String[] args) {
        for (int i = 1; i > 0; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
            }
            //
        }
    }

}