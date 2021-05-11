package ua.kliushenkov.lesson5;

//Проверка на дублирующий элемент

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(containsForDuplicates(numbers));
    }

    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }
    }
        private static boolean containsForDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
