package com.company.readmethods;

import java.util.Scanner;


public class ConsoleReader {

    Scanner scanner = new Scanner(System.in);

    /**
     * Read string from the console
     * @return a string
     */
    public String readString() {
        String name = scanner.next();
        return name;
    }

    /**
     * Read int number from the console
     * @return the number
     */
    public int readInt() {
        int number = scanner.nextInt();
        return number;
    }

    /**
     * Read a char from the console
     * @return the char
     */
    public char readChar() {
        char ch = scanner.next().charAt(2);
        return ch;
    }

    /**
     * Read float number from the console
     * @return the float number
     */
    public float readFloat() {
        float flt = scanner.nextFloat();
        return flt;
    }
}