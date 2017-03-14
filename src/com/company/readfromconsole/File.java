package com.company.readfromconsole;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {

    /**
     * Fields
     */
    private Scanner scanner = new Scanner(System.in);
    private FileWriter fileWriter;
    private String chachacter;

    /**
     * Create new document with specific name
     *
     * @param fileName is the name of the file
     * @throws IOException
     */
    public File(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    /**
     * Close fileWrite method
     */
    private void closeWriter() throws IOException {
        fileWriter.close();
    }

    /**
     * Write on the previous created file untill reach the separator
     *
     * @param separator is string, which will stop the scanner
     * @throws IOException
     */
    public void writeTillReach(String separator) throws IOException {
        this.chachacter = separator;


            while (true) {
                String input = scanner.next();

                if (input.equals(separator)) {
                    try {
                        closeWriter();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else fileWriter.write(input);
                fileWriter.write("\n");
                fileWriter.flush();
            }

    }
}
