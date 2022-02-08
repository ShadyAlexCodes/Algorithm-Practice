package edu.neumomt;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Math
        System.out.println("sqr: " + Algorithm.sqr(8));
        System.out.println("sqr: " + Algorithm.sqr(3));

        System.out.println("min: " + Algorithm.min(3, 8));
        System.out.println("max: " + Algorithm.max(3, 8));

        System.out.println("abs: " + Algorithm.abs(5));
        System.out.println("abs: " + Algorithm.abs(-25));

        System.out.println("Math Lib min: " + Math.min(1, 2));
        System.out.println("Math Lib max: " + Math.max(5, 20));

        // Arrays
        //int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40, 5, 34, 6, 21 };
        int[] numbers = new int[100];

        for (int i = 0; i < Algorithm.size(numbers); i++) {
            numbers[i] = new Random().nextInt(1, 11);
            System.out.print(numbers[i] + " ");
        }
        Algorithm.print(numbers);

        int[] tally = new int[10];
        for (var number : numbers) {
            tally[number - 1]++;
            System.out.print(String.format("%2d - ", number));
            Algorithm.print(tally);
        }

        System.out.println("Array contains: " + Algorithm.contains(numbers, 5));
        System.out.println("Array size: " + Algorithm.size(numbers));
        System.out.println("Array indexOf: " + Algorithm.indexOf(numbers, 10));
        System.out.println("Array sum: " + Algorithm.sum(numbers));
        System.out.println("Array average: " + String.format("%.2f", Algorithm.average(numbers)));
        System.out.println("Array min: " + Algorithm.min(numbers));
        System.out.println("Array max: " + Algorithm.max(numbers));
        System.out.println("Array mode: " + (Algorithm.indexOf(tally, Algorithm.max(tally)) + 1));


        int[] num = { 32, 54, 1, 10, 75 };
        Algorithm.print(num);
        Algorithm.reverse(num);
        Algorithm.print(num);

        int iv1 = 52;
        int iv2 = 65;

        int temp;

        temp = 65;
        iv2 = iv1;
        iv1 = temp;
    }
}
