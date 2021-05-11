package ua.kliushenkov.lesson5;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Minimal value on index: " + findMinValueIndex(numbers));
        System.out.println("Max value on index: " + findMaxValueIndex(numbers));
        System.out.println("Avg Value: " + findAvgValueIndex(numbers));
        System.out.println("Avg Value on index: " + findCentralElemen(numbers));

    }

    private static int findCentralElemen(int[]numbers){
        return numbers[numbers.length / 2];
    }


    private static int findAvgValueIndex(int[] numbers){
        int[] local = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(local);
        int avgValue = local[(numbers.length / 2)];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == avgValue){
                return i;
            }
        }
        return -1;
    }

    private static int findMaxValueIndex(int[] numbers){
        int index = 0;
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(maxValue < numbers[i]){
                index = i;
                maxValue = numbers[i];
            }
        }
        return index;
    }

    private static int findMinValueIndex(int[] numbers){
        int index = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(minValue > numbers[i]){
                index = i;
                minValue = numbers[i];
            }
        }
        return index;
    }

    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }
}
