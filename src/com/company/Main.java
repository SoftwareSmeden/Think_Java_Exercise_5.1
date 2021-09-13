package com.company;

public class Main {

    public static void main(String[] args) {
	// Think Java - Exercise 5.1

        // Variable int, identifier x, value 2.
        int x = 2;

        // Before the code is rewritten to a single if statement.
        /*
        if (x > 0) {
            if (x < 10) {
                System.out.println("positive single digit number.");
            }
        } */


        // if statement rewritten to a single if statement.
        if (x > 0 && x <10) {
                System.out.println("positive single digit number.");
            }

    }

}
