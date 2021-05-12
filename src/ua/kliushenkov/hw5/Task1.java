package ua.kliushenkov.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        fillArrayIndex(array);
        for (int innerArray[] : array) {
            System.out.println(Arrays.toString(innerArray));
        }
    }

    private static void fillArrayIndex(int[][] mass){
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i % 2 == 1) {
                    mass[i][j] = -(i + j);
                }else{
                    mass[i][j] = i + j;
                }

            }
            }
        }
    }

