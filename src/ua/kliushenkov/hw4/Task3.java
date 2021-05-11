package ua.kliushenkov.hw4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }


        System.out.println(compNumber(array));
    }

    private static int compNumber(int[] mass){
        int count = 0;

        for(int i=0; i < mass.length; i++) {
            if(mass[i] > 0) {
                boolean simpleNum = false;
                for (int j = 2; j <= mass[i]/j ; j++) {
                    if ((mass[i] % j == 0)) simpleNum = true;
                }
                if (simpleNum) count++;
            }
        }
        return count;
    }
}
