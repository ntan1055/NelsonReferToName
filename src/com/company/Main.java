package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomInt = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+name+','+" please guess the number.");
        int number = input.nextInt();
        while (randomInt != number)
        {
            if(randomInt > number)
            {
                System.out.println(name + ',' + " the number is higher than " + number);
                number = input.nextInt();
            }
            if(randomInt < number)
            {
                System.out.println(name + ',' + " the number is lower than "+ number);
                number = input.nextInt();
            }
        }
        System.out.println("You got it " + name + ',' + " the number is " + number + '!');
    }
}
