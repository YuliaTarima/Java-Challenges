package test.java.maintask;

import java.util.Scanner;
import java.lang.*;

import utils.StringUtil;

public class TaskOneGreetUser {

    public static void main(String[] args) {
        System.out.println("What is your name?");

//        Scanner scanner = new Scanner(System.in);
//        try {
//            ...
//        } finally {
//            scanner.close();
//        }
        try (Scanner scanner = new Scanner(System.in)) {
            String inputString = scanner.nextLine();
            StringUtil.checkNotEmpty(inputString);
            System.out.printf("%n***%nHello, %s%n", inputString);
        }
    }


}
