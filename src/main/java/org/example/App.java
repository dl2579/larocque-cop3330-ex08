package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print( "How many people? " );
        int numPpl = sc.nextInt();

        System.out.print( "How many pizzas do you have? " );
        int numPizza = sc.nextInt();

        System.out.print( "How many slices per pizza? " );
        int numSlices = sc.nextInt();
        int totSlices = numSlices * numPizza;

        System.out.printf("%d people with %d pizzas (%d slices)%n", numPpl, numPizza, totSlices);
        System.out.printf("Each person gets %d pieces of pizza%n", totSlices/numPpl);
        System.out.printf("There are %d leftover pieces.%n", totSlices%numPizza);


    }
}
