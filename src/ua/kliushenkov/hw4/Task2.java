package ua.kliushenkov.hw4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] array = {4, 6, 8, 10};
        Random random = new Random();

       /* for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }*/

        System.out.println(simpleCount(array));


    }
    private static int simpleCount(int[] mass){
        int count = 0;

        for (int k : mass) {
            if (k > 0) {
                boolean simpleNum = true;
                for (int j = 2; j <= k / j; j++) {
                    if ((k % j == 0) && (k != 2)) {
                        simpleNum = false;
                        break;
                    }
                }
                if (simpleNum) count++;
            }
        }
        return count;
    }
}
