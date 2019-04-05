package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello user! Can you write your name, please?");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name + ", we kindly invite you to the grand opening ceremony!");
    }
}
