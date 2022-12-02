//随机数

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random1=new Random();
        int num1=random1.nextInt();
        System.out.println(num1);
       int num2= random1.nextInt(101);
        System.out.println(num2);
    }
}
