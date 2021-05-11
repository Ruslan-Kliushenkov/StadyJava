package ua.kliushenkov.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Test31 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(findMaxValue(numbers));
    }

    private static boolean checkCondition(int num){
        return ((num % 3 == 0) || (num % 7 == 0));
    }

    private static int findMaxValue(int[] numbers){
        int maxValue = -1;
        for (int number : numbers) {
            if ((maxValue < number) && checkCondition(number)) {
                maxValue = number;
            }
        }
        return maxValue;
    }
    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }
    }
}
