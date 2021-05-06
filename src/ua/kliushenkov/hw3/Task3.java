package ua.kliushenkov.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст для подсчёта слов");
        String userText = input.nextLine();
        System.out.println(wordCounter(userText));
    }

    private static int wordCounter(String text) {
        String[] redact = text.split(" ");
        return redact.length;
    }
}
