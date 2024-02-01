package com.emem.mult;

import java.util.Scanner;

public class Multi {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("My multiplication tables are:");
        for(int i=2; i<=12; i++){
            for(int j=1; j<=12; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
