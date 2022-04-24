package com.zhandos;

import java.io.*;
import java.util.Scanner;

class MyFile {
    // выводит список всех файлов и директорий для `path` - ls
    public static void listDirectory(String path) { //TODO only ls without path
        try {
            File file = new File(path);
            String[] fileList = file.list();
            for(String fileOrDir : fileList) {
                System.out.println(fileOrDir);
            }
        } catch (Exception e) {
            System.out.printf("%s", e);
        }
    };

    // выводит список файлов с расширением `.py` в `path` - ls_py
    public static void listPythonFiles(String path) {
        try {
            File file = new File(path);
            String[] fileList = file.list();
            for(String fileOrDir : fileList) {
                System.out.println(fileOrDir);
            }
        } catch (Exception e) {
            System.out.printf("%s", e);
        }
    };

    // выводит `true`, если `path` это директория, в других случаях `false` - id_dir
    public static void isDirectory(String path) {

    };

    // выводит `директория` или `файл` в зависимости от типа `path` - define
    public static void define(String path) {

    };

    // выводит права для файла в формате `rwx` для текущего пользователя - readmod
    public static void printPermissions(String path) {

    };

    // устанавливает права для файла `path` - setmod
    public static void setPermissions(String path, String permissions) {

    };

    // выводит контент файла - cat
    public static void printContent(String path) {

    };

    // добавляет строке `# Autogenerated line` в конец `path` - append
    public static void appendFooter(String path) {

    };

    // создает копию `path` в директорию `/tmp/${date}.backup` где, date - это дата в формате `dd-mm-yyyy`. `path` может быть директорией или файлом. При директории, копируется весь контент. - bc
    public static void createBackup(String path) {

    };

    // выводит самое длинное слово в файле - greplong
    public static void printLongestWord(String path) {

    };

    // выводит список команд и их описание - help
    public static void help() {
        try {
            File read_file = new File("src/manual.txt");
            Scanner obj = new Scanner(read_file);
            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
        } catch (Exception e) {
            System.out.printf("%s", e);
        }
    };


    // завершает работу программы - exit
    public static void exit() {
        System.out.println("Goodbye");
        System.exit(0);
    };
}