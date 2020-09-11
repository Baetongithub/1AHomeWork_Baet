package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String phrase1 = sc.nextLine();
        System.out.println("Хэлоу," + " " + phrase1 + "!");
    }
}
