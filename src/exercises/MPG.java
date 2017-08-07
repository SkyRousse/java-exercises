package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the miles traveled: ");
        float miles = in.nextFloat();
        System.out.println("enter the gallons of gas used: ");
        float gallons = in.nextFloat();
        float mpg = miles / gallons;
        System.out.println("you traveled : " + mpg + " miles per gallon");
    }
}
