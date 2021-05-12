package ua.kliushenkov.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
    int[] array = new int[15];
    fillArray(array);
    System.out.println(Arrays.toString(array));
        System.out.println(checkCondition(array));
    }

    private static boolean checkCondition(int[] mass){
        boolean condition = true;
        for (int i = 1; i < mass.length; i++) {
            if(mass[i-1] < mass[i]) condition = false;
        }
        return condition;
    }

    private static void fillArray(int[] mass){
        int j = 0;
        for (int i = mass.length - 1;  i > 0; i--) {
            mass[j] = i;
            j++;
        }
    }
}
