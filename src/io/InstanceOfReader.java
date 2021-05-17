package io;

import java.io.*;

public class InstanceOfReader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/documents/test.txt");
        File newFile = new File("src/documents/writerTest.txt");
        readFile(file, newFile);


    }

    public static void readFile(File file, File filePath) throws IOException{
        try (Reader reader = new FileReader(file.getAbsolutePath()); Writer writer = new FileWriter(filePath.getAbsolutePath())) {
            int n = (int) file.length();
            char[] buffer = new char[n];
            int len;
            while ((len = reader.read(buffer))!= -1) {
                System.out.println("read " + len + " chars.");
                System.out.println(buffer);
            }

            writer.write(buffer);
        }

    }
}
