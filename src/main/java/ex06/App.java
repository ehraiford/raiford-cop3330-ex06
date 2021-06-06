/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex06;
import java.time.Year;
import java.util.Scanner;


public class App {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String cAge = in.nextLine();
        int intCAge = Integer.parseInt(cAge);

        System.out.print("At what age would you like to retire? ");
        String rAge = in.nextLine();
        int intRAge = Integer.parseInt(rAge);

        int diff = intRAge - intCAge;
        System.out.println("You have " + diff + " years left until you can retire.");
        int year = Year.now().getValue(), yearRetire = year + diff;
        System.out.print("It's " + year + ", so you can retire in " + yearRetire + ".");
    }
}
