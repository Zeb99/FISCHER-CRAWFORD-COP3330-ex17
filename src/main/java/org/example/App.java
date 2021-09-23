package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int gender, A, W, H;
        double r_male = 0.73, r_female = 0.66, BAC;


        System.out.print("Enter a 1 if you are a male or a 2 if you are female: ");
        gender = scan.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        A = scan.nextInt();
        System.out.print("What is your weight, in pounds? ");
        W = scan.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        H = scan.nextInt();
        System.out.println("\n");

        if(gender == 1){
            BAC = (float) ((A * 5.14 / W * r_male) - 0.015 * H);
            if(BAC <= 0.08){
                System.out.println("Your BAC is " + BAC);
                System.out.println("It is legal for you to drive");
            } else if(BAC > 0.08){
                System.out.println("Your BAC is " + BAC);
                System.out.println("It is not legal for you to drive");
            } else{
                System.out.println("Your input was not valid");
            }
        }
        else if(gender == 2){
            BAC = (A * 5.14 / W * r_female) - 0.015 * H;
            if(BAC <= 0.08){
                System.out.println("Your BAC is " + BAC);
                System.out.println("It is legal for you to drive");
            } else if(BAC > 0.08){
                System.out.println("Your BAC is " + BAC);
                System.out.println("It is not legal for you to drive");
            } else{
                System.out.println("Your input was not valid");
            }
        }
        else{
            System.out.println("Your input was not valid.");
        }



    }
}
