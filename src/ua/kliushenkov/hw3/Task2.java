package ua.kliushenkov.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter text");
            String userText = input.nextLine();
            userText = redactorText(userText);
            System.out.println(redactorText(userText));
            System.out.println(polimorh(userText));
        }

    }

    private static boolean polimorh (String poli) {
        return poli.equals(new StringBuilder(poli).reverse().toString());

    }

    private static String redactorText(String args) {

        return args.replace(" ","").toLowerCase();
    }
}
