package com.company.readmethods;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        ConsoleReader readTypes = new ConsoleReader();
        try {

            readTypes.readString();
            /*readTypes.readInt();
            readTypes.readChar();
            readTypes.readFloat();*/

        } catch (InputMismatchException exception) {
            System.out.println("Enter a valid digit");
        }
    }
}