package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dear user, please input a string of parenthesis!");

        Scanner sc = new Scanner(System.in);
        String p = sc.next();

        if (p.length() % 2 == 0) {
            System.out.println("Parenthesis match, valid!");
        } else {
            System.out.println("Parenthesis doesn't match, invalid!");
        }
    }
}
