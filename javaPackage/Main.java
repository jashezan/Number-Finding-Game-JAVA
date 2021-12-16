package com.javaPackage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber,count=0;
        do {
            System.out.print("Guess My Number(1-100) : ");
            userNumber = sc.nextInt();
            count++;

            if(myNumber==userNumber){
                System.out.println("Woohoo.... You guessed it right in "+ count + " steps.");
                break;
            }else if (userNumber > myNumber){
                System.out.println("Bigger");
            }else{
                System.out.println("Smaller");
            }
        }while(userNumber>=0);
        System.out.println("My Number was : " + myNumber);
    }
}
