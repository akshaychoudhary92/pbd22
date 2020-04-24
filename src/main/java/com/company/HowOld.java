package com.company;

import java.util.Scanner;

public class HowOld {

    public void oldways(){
        Scanner s = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Hey, what's your name?");

        name = s.nextLine();

        System.out.println("Ok, " + name + " ,how old are you?");
        age = s.nextInt();

        if(age < 16 ){
            System.out.println("You cant drive");
            System.out.println("You cant vote");
            System.out.println("your cant rent a car");
        }else if(age < 18){
            System.out.println("You cant vote");
            System.out.println("your cant rent a car");
        }else if(age < 25){
            System.out.println("your cant rent a car");
        }else {
            System.out.println("you can do anyting thats legal");
        }
    }
}
