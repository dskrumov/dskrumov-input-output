package com.company.streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ObjectTransfer {
    /**
     * Fields
     */
    private InputStream inputStream;
    private OutputStream outputStream;

    /**
     * Read from the array which is defined in main method and writes the data with specific length
     * and offset in the streamTEST.txt
     *
     * @throws IOException
     */
    public void transfer(String inputFileName, int offset, int length) throws IOException {
        Path path = Paths.get(inputFileName);
        byte[] data = Files.readAllBytes(path);
        inputStream = new ByteArrayInputStream(data);
        outputStream = new FileOutputStream("streamsTESTout.txt");
        outputStream.write(data, offset, length);

        outputStream.flush();

    }

}
