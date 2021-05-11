package ua.kliushenkov.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int[] numbers = new int[25];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("boys: " + calcBoyHeight(numbers));
        System.out.println("girl: " + calcGirlHeight(numbers));
    }

    private static double calcBoyHeight(int[] numbers){
        int amount = 0;
        int totalHeight = 0;
        for (int num : numbers){
            if (num<0){
                totalHeight -= num;
                amount++;
            }
        }
        return Math.abs((double)totalHeight / amount);
        }
    private static double calcGirlHeight(int[] numbers){
        int amount = 0;
        int totalHeight = 0;
        for (int num : numbers){
            if (num>0){
                totalHeight += num;
                amount++;
            }
        }
        return (double)totalHeight / amount;
    }


    private static void fillArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomLength = random.nextInt(150);
            numbers[i] = random.nextBoolean()? randomLength : -randomLength;
        }
    }


}
