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
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("> ");
                String line = scanner.nextLine();
                String[] words = line.split(" ", 2);
                switch (words[0]) {
                    case "ls" -> MyFile.listDirectory(words[1]);
                    case "ls_py" -> MyFile.listPythonFiles(words[1]);
                    case "is_dir" -> MyFile.isDirectory(words[1]);
                    case "define" -> MyFile.define(words[1]);
                    case "readmod" -> MyFile.printPermissions(words[1]);
                    case "setmod" -> MyFile.setPermissions(words[1], words[2]);
                    case "cat" -> MyFile.printContent(words[1]);
                    case "append" -> MyFile.appendFooter(words[1]);
                    case "bc" -> MyFile.createBackup(words[1]);
                    case "greplong" -> MyFile.printLongestWord(words[1]);
                    case "help" -> MyFile.help();
                    case "exit" -> MyFile.exit();
                    default -> System.out.println("Please enter valid command");
                }
            }
        } catch (Exception e) {
            System.out.printf("%s", e);
        }
    }
}