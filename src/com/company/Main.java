package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many people are inside the room?");

        Scanner sc = new Scanner(System.in);
        int inRoom = sc.nextInt();

        System.out.println("How many people are still outside?");

        int outside = sc.nextInt();

        if (100 - inRoom < outside) {
            System.out.println("People in the queue can't fit into the room!");
        } else {
            System.out.println("People in the queue can fit into the room!");
        }
    }
}
