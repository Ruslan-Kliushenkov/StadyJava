package ua.kliushenkov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        randomGame(a);
    }

    private static void randomGame(int a) {
        Scanner input = new Scanner(System.in);
        while ( true ){
            System.out.println("Введите значение");
            int b = input.nextInt();
            if (a > b){
                System.out.println("Мало");
            }else if (a < b){
                System.out.println("Много");

            }else {
                System.out.println("Bingo!");
                break;
            }
        }

    }
}
