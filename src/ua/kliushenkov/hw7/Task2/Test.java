package ua.kliushenkov.hw7.Task2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        VectorTools[] testVectorTools = Arrays.copyOf(VectorTools.getSomeVectors(2), 2);
        for (VectorTools n : testVectorTools) {
            System.out.println(n);
        }

        System.out.println("Vector Length = " + testVectorTools[0].vectorLength() );
        System.out.println("Scalar Multiply = " + VectorTools.scalarMultiply(testVectorTools[0],testVectorTools[1]));
        System.out.println("Cos = " + VectorTools.cos(testVectorTools[0],testVectorTools[1]));
        System.out.println("Vector Sum = " + VectorTools.sum(testVectorTools[0],testVectorTools[1]));
        System.out.println("Vector Dif = " + VectorTools.dif(testVectorTools[0],testVectorTools[1]));
    }

}
