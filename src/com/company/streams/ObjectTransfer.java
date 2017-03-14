package com.company.streams;

import java.io.*;

public class ObjectTransfer {
    /**
     * Fields
     */
    private InputStream inputStream;
    private OutputStream outputStream;

    /**
     * Read from the array which is defined in main method and writes the data with specific length
     * and offset in the streamTEST.txt
     * @param array is the defined by us array
     * @throws IOException
     */
    public void ByteArrayInputStream(byte[] array, int offset, int length) throws IOException {
        inputStream = new ByteArrayInputStream(array);
        outputStream = new FileOutputStream("streamsTEST.txt");
        outputStream.write(array,offset,length);
        outputStream.flush();

    }


}
