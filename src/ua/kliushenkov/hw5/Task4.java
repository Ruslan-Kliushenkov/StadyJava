package ua.kliushenkov.hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[15];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        Scanner indexForDelete = new Scanner(System.in);
        System.out.println("Введите индекс числа для удаления");
        int numberForDelete = indexForDelete.nextInt();
        int[] newArray = Arrays.copyOf(deleteIndexNumber(array, numberForDelete), array.length);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] deleteIndexNumber(int[] mass, int num) {
       mass[num] = 0;
        for (int i = num; i < mass.length - num ; i++) {
            mass[i] = mass[i + 1];
        }
        mass[mass.length - 1] = -1;
        return mass;
    }

    private static void fillArray(int[] mass) {
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(5);
        }
    }
}
