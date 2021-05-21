package ua.kliushenkov.hw7.Task2;

import java.util.Random;

public class VectorTools {
    int x,y,z;

    protected  VectorTools(){

    }

    protected VectorTools(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected double vectorLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    protected static int scalarMultiply(VectorTools vectorOne, VectorTools vectorTwo) {
        return ((vectorOne.x * vectorTwo.x) + (vectorOne.y * vectorTwo.y) + (vectorOne.z * vectorTwo.z));
    }

    protected static double cos(VectorTools vectorOne, VectorTools vectorTwo) {
        return scalarMultiply(vectorOne, vectorTwo) / (vectorOne.vectorLength() * (vectorTwo.vectorLength()));
    }

    protected static VectorTools sum(VectorTools vectorOne, VectorTools vectorTwo) {
        VectorTools resultVector = new VectorTools();
        resultVector.x = vectorOne.x + vectorTwo.x;
        resultVector.y = vectorOne.y + vectorTwo.y;
        resultVector.z = vectorOne.z + vectorTwo.z;
        return resultVector;
    }

    protected static VectorTools dif(VectorTools vectorOne, VectorTools vectorTwo) {
        VectorTools resultVector = new VectorTools();
        resultVector.x = vectorOne.x - vectorTwo.x;
        resultVector.y = vectorOne.y - vectorTwo.y;
        resultVector.z = vectorOne.z - vectorTwo.z;
        return resultVector;
    }

    protected static VectorTools[] getSomeVectors(int number) {
        Random random = new Random();
        VectorTools[] vectorArray = new VectorTools[number];
        for (int i = 0; i < vectorArray.length; i++ ) {
            vectorArray[i] = new VectorTools(random.nextInt(10), random.nextInt(10), random.nextInt(10));
        }
        return vectorArray;
    }

    @Override
    public String toString() {
        return "VectorTools{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
