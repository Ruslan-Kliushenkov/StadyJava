package ua.kliushenkov.hw4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        System.out.println(simpleCount(array));


    }
    private static int simpleCount(int[] mass){
        int count = -1;

        for(int i=0; i < mass.length; i++) {
            if(mass[i] > 0) {
                boolean simpleNum = true;
                for (int j = 2; j <= mass[i]/j ; j++) {  //mass[i]/j для оптимизации(по факту прохождения половины числа - дальнейшее вычисление не имеет смысла)
                    if ((mass[i] % j == 0) && (mass[i] != 2)) simpleNum = false;
                }
                if (simpleNum) count++;
            }
        }
        return count;
    }
}
