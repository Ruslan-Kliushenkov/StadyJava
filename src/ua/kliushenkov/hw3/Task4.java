package ua.kliushenkov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println(randomGame(a));
    }

    private static String randomGame(int a) {
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Введите число");
            int b = input.nextInt();
            if (a > b){

                System.out.println("Мало");
            }else if (a < b){
                System.out.println("Много");
            }else{
                return "Bingo!";
            }
        }while (true);


        }

    }

