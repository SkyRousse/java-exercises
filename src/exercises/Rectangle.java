package exercises;

import java.util.Scanner;

public class Rectangle {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the width of the rectangle: ");
        double width = in.nextDouble();
        System.out.println("enter the length of the rectangle");
        double length = in.nextDouble();
        double area = length * width;
        System.out.println("The area of the triangle is: " + area);

    }
}
