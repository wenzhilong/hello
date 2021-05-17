package io;

import java.io.*;

/**
 * InputStream是Java标准库提供的最基本的输入流，它是抽象类而不是接口，它是所有输入流的超类。
 */
public class InstanceOfInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("src/documents/test.txt");
        System.out.println(file.getAbsolutePath());
        readFile(file);
        writeFile(new File("src/documents/writeTest.txt"), "hello, world!".getBytes("UTF-8"));

    }

    // InputStream
    public static void readFile(File file) throws IOException{
        try (InputStream input = new FileInputStream(file.getAbsolutePath())) {
            byte[] buffer = new byte[1024];
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read " + n + " bytes");
            }

        }
    }

    // OutputStream
    public static void writeFile(File file, byte[] data) throws IOException {
        try (OutputStream output = new FileOutputStream(file.getAbsolutePath())){
            for (byte i : data) {
                output.write(i);
            }
        }
    }
}
