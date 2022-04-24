package com.zhandos;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            File read_file = new File("src/manual.txt");
            Scanner obj = new Scanner(read_file);
            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }

            MyFile file = new MyFile();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.printf("> ");
                String line = scanner.nextLine();
                String words[] = line.split(" ", 2);
                if (words[0].equals("ls")) {
                    file.listDirectory(words[1]);
                } else if (words[0].equals("exit")) {
                    file.exit();
                }
//                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.printf("%s", e);
        }
    }
}