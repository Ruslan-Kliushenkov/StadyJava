package ua.kliushenkov.modul1.Task1;

public class TaskOne {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 5, 5, 7, 7, 8, 8, 0, 0, -1, -1, -1, 0};
        System.out.println(calcUniNum(array));
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
