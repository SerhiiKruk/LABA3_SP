package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File my_file = new File("test.txt");
            Scanner sc = new Scanner(my_file);
            Lexer lexer = new Lexer();
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                lexer.startState(line);
            }
            lexer.DisplayResults();

        } catch (FileNotFoundException error) {
            System.out.println("No such file");
        }
    }
}