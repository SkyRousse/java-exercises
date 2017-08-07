package exercises;

import java.util.ArrayList;
import java.util.Scanner;


public class SumArrayList {
    public static Double getEvenSum(ArrayList<Double> numbersList) {
        Double sum = 0.00;
        for (Double number : numbersList) {
            if(number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        double newNumber;

        System.out.println("Enter a random number");

        // Get numbers from input

        do {
            newNumber = in.nextDouble();

            if (numbers.size() < 10) {
                numbers.add(newNumber);
            }
        } while(numbers.size() < 10);

        Double total = getEvenSum(numbers);
        System.out.println("The sum of the even numbers in the list is: " + total);
    }
}
