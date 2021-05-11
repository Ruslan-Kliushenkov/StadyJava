package ua.kliushenkov.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        fillArray(numbers);
        int[] newArray = sortArray(Arrays.copyOf(numbers, numbers.length));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newArray));
        System.out.println(findMaxValue(newArray));
    }

    private static int[] sortArray(int[] mass){
        for (int i = 0; i < mass.length; i++) {
            if((mass[i] % 3 != 0) && (mass[i] % 7 != 0)){
                mass[i] = 0;
            }
        }
        return mass;
    }

    private static int findMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(maxValue < numbers[i]){
                maxValue = numbers[i];
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
