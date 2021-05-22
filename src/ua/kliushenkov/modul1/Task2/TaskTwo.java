package ua.kliushenkov.modul1.Task2;

import java.util.Scanner;

public class TaskTwo {
    static final String[] chessBoardNum = {"1", "2", "3", "4", "5", "6", "7", "8"};
    static final String[] chessBoardLet = {"a", "b", "c", "d", "e", "f", "g", "h"};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите позицию фигуры в формате - a 1");
        String position = input.nextLine().toLowerCase();
        String[] pos = inputToArray(position);
        if (!checkForCorrect(pos)) {
            out();
        }

        System.out.println("Введите позицию, для проверки возможности хода");
        String nextPosition = input.nextLine().toLowerCase();
        String[] nextPos = inputToArray(nextPosition);
        if (!checkForCorrect(nextPos)) {
            out();
        }

        System.out.println(checkCondition(pos, nextPos));

    }

    public static String[] inputToArray(String str) {
        return str.split(" ");
    }

    public static boolean checkForCorrect(String[] mass) {
        boolean checkNum = false;
        boolean checkLet = false;
        for (String s : chessBoardNum) {
            if (mass[1].equals(s)) {
                checkNum = true;
                break;
            }

        }
        for (String s : chessBoardLet) {
            if (mass[0].equals(s)) {
                checkLet = true;
                break;
            }

        }

        return checkNum && checkLet;
    }

    public static void out() {
        System.out.println("Некоректный ввод");
        System.exit(-1);
    }

    public static boolean checkCondition(String[] firstPosition, String[] secondPosition) {
        boolean result = false;
        int fY = 0;
        int fX = 0;
        for (int i = 0; i < chessBoardLet.length; i++) {
            if (firstPosition[0].equals(chessBoardLet[i])) {
                fY = i;
            }
        }
        for (int i = 0; i < chessBoardNum.length; i++) {
            if (firstPosition[1].equals(chessBoardNum[i])) {
                fX = i;
            }
        }

        int sY = 0;
        int sX = 0;
        for (int i = 0; i < chessBoardLet.length; i++) {
            if (secondPosition[0].equals(chessBoardLet[i])) {
                sY = i;
            }
        }
        for (int i = 0; i < chessBoardNum.length; i++) {
            if (secondPosition[1].equals(chessBoardNum[i])) {
                sX = i;
            }
        }
        if (((fX == sX + 2 || fX == sX - 2) && (fY == sY + 1 || fY == sY - 1))){
            result = true;
        }else if((fX == sX - 1 || fX == sX + 1) && (fY == sY + 2 || fY == sY - 2)){

            result = true;
        }

        return result;
    }
}
