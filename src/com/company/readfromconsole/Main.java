package com.company.readfromconsole;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        new File("TestWriteOnTextDocument.txt").writeTillReach("aaaa");
    }
}