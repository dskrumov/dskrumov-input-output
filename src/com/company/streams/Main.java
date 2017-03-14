package com.company.streams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        ObjectTransfer objectTransfer = new ObjectTransfer();
        objectTransfer.transfer("streamsTESTin.txt", 2, 4);


    }
}
