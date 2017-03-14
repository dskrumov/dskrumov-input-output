package com.company.reversedocument;
import java.io.*;
public class File {
    /**
     * Fields
     */
    private String line;
    private String temp = "";
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    /**
     * Create the file
     * @param documentReadName is the name of the created file
     */
    public File(String documentReadName) {
        try {

            fileReader = new FileReader(documentReadName);
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException exception) {
            System.out.println("No such file with this name");
        }
    }

    /**
     * Reverse the contend from the previous created file by reading it
     * @param documentWriteName is the name of the second document which will store the reversed information
     * @throws IOException
     */
    public void reverseInto(String documentWriteName) throws IOException {
        FileWriter fileWriter = new FileWriter(documentWriteName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while ((line = bufferedReader.readLine()) != null) {
            StringBuffer stringBuffer = new StringBuffer(line);
            temp = stringBuffer.reverse().toString();
            bufferedWriter.write(temp + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}


