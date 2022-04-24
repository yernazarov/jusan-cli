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

            FileWriter write_file = new FileWriter("log.txt", true);
            Scanner scanner = new Scanner(System.in);
            System.out.printf("> ");
            while (true) {
                String line = scanner.nextLine();
                if (line.equals("Выход")) {
                    write_file.close();
                    File log_file = new File("log.txt");
                    log_file.delete();
                    return;
                }
                write_file.write(line + "\n");
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.printf("%s", e);
        }
    }
}