package ua.kliushenkov.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        fillArray(array);
        for (int[] n : array){
            System.out.println(Arrays.toString(n));
        }
        System.out.println();
        for (int[] m : replaceIndexArray(array)) {
            System.out.println(Arrays.toString(m));
        }
    }

    private static int[][] replaceIndexArray(int[][] mass){
        int[][] newArray = new int[mass.length][mass.length];
        for (int i = 0; i < mass.length ; i++) {
            for (int j = 0; j < mass.length ; j++) {
                newArray[i][j] = mass[j][i];
            }
        }
        return newArray;
    }

    private static void fillArray(int[][] mass){
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = count;
                count++;
            }
        }
    }
}
