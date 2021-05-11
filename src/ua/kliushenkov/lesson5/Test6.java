package ua.kliushenkov.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        fillArray(array);

        for (int[] innerArray: array) {
            System.out.println(Arrays.toString(innerArray));
        }

        System.out.println(calcDioArray(array));
    }

    private static int calcDioArray(int[][] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i][i];
        }
        return sum;
    }

    private static void fillArray(int[][] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = random.nextInt(2);
            }
        }
    }
}
