package ua.kliushenkov.modul1.Task1;

import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        int[] array = {-1, 1, 1, 2, 2, 3, 4, -5, -5, 0, 0, -1, -1, -1, -1, -1, 2, 2};
        System.out.println(calcUniNum(Arrays.copyOf(array, array.length)));
    }

    protected static int calcUniNum(int[] mass) {
        int calc = 0;
        int zeroCheck = 0;
        for (int k : mass) {
            if (k == 0) {
                calc++;
                zeroCheck = 1;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] != 0) {
                    if (mass[i] == mass[j]) {
                        calc++;
                        mass[j] = 0;
                    }
                }
            }
        }
        return mass.length - calc + zeroCheck;
    }
}
