package org.example;

import java.util.Scanner;

import static java.lang.Character.getType;

public class Main {
    public static String toString(int number){
        String x = String.valueOf(number);
        return x;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number>0){
        toString(number);
        } else if (number == 0) {

        }
        else{
            number = number *=-1;
    }
        System.out.println(number);
    }
}