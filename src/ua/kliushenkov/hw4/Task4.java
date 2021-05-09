package ua.kliushenkov.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        int[] newArray = Arrays.stream(evenTerminate(array)).toArray();
        for (int n : newArray){
            System.out.println(n);
        }
    }
    private static int[] evenTerminate(int[] mass){

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) mass[i] =0;
        }

        return mass;
    }
}
