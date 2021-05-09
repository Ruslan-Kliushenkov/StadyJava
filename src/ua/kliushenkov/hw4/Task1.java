package ua.kliushenkov.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[400];
        array = fillArray(array);
        System.out.println(average(array));
        System.out.println(geoMean(array));


    }

    private static double geoMean(int[] arrayToGeo) {
        double counter = 0.0;
        for (int j : arrayToGeo) {
            counter += Math.log(Math.abs(j));
        }
        return Math.exp(counter / arrayToGeo.length);
    }

    private static int average(int[] arrayAverage) {
        long count = 0;
        for (int j : arrayAverage) {
            count += j;
        }
        return (int) count / arrayAverage.length;


    }

    private static int[] fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}