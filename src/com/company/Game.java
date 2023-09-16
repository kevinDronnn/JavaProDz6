package com.company;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String word = words[0];

        System.out.println("Я загадал одно из этих слов, угадай его");
        System.out.println();

        for (int i = 0; i < words.length; i++) {
            if (i % 5 == 0 && i > 1) {
                System.out.print(words[i] + "\n");
            }
            System.out.print(words[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine().toLowerCase();
        String res = "";
        if (userWord.equals(word)) {
            System.out.println("Вы угадали!");
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == userWord.charAt(i)) {
                    res += word.charAt(i);
                }
            }
        }

        if (res.length() == 0) {
            System.out.println("Вы не угадали ни единой буквы попробуйте еще раз");
            userWord = scanner.nextLine().toLowerCase();
            while (!word.equals(res)) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == userWord.charAt(i)) {
                        res += word.charAt(i);
                    }
                }
                if (userWord.equals(word)) {
                    System.out.println("Вы угадали!");
                } else {
                    System.out.print("Вот сколько букв вы угадали из этого слова: " + res);
                    for (int i = 0; i < 15 - res.length(); i++) {
                        System.out.print("#");
                    }
                    System.out.println();
                    System.out.println("Попробуйте еще раз");
                    res = "";
                    userWord = scanner.nextLine().toLowerCase();
                }
            }
        }
    }
}
