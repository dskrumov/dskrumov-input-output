package com.company.readmethods;

import java.util.Scanner;


public class ConsoleReader {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Read string from the console
     *
     * @return a string
     */
    public String readString() {
        return scanner.next();
    }

    /**
     * Read int number from the console
     *
     * @return the number
     */
    public int readInt() {
        return scanner.nextInt();
    }

    /**
     * Read a char from the console
     *
     * @return the char
     */
    public char readChar() {
        char ch = scanner.next().charAt(0);
        return ch;
    }

    /**
     * Read float number from the console
     *
     * @return the float number
     */
    public float readFloat() {
        return scanner.nextFloat();
    }
}