package io;

import java.util.Scanner;

public class IOInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input your name: ");
        String name = scanner.nextLine();  // 读取一行输入并获取字符串

        System.out.println("input your age: ");
        int age = scanner.nextInt();

        System.out.printf("Hi, %s, you are %d\n years old.", name, age);
    }
}
