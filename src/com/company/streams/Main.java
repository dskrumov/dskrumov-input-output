package com.company.streams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        byte[] array = {'1', '2', '3', '4', '5', '6','7', '8', '9','0'};
        ObjectTransfer objectTransfer = new ObjectTransfer();
        objectTransfer.ByteArrayInputStream(array, 2, 4);


    }
}
