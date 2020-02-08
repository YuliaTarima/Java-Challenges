package test.java.maintask;

import utils.NumberUtil;

import java.util.Scanner;
import java.lang.*;

public class TaskFourEnterNumbersCalculateSumMultiply {
    public static void main(String[] args) {
        System.out.print("Please enter your first number!\n");
        Scanner firstScanner = new Scanner(System.in);
        String firstUserInputString = firstScanner.nextLine();
        Boolean isFirstInputInteger = NumberUtil.isInteger(firstUserInputString);
        int firstUserInputInt = NumberUtil.stringToInteger(firstUserInputString, isFirstInputInteger);
        System.out.println("The first number you entered is: " + firstUserInputInt);

        System.out.print("Please enter your second number!\n");
        Scanner secondScanner = new Scanner(System.in);
        String secondUserInputString = secondScanner.nextLine();
        Boolean isSecondInputInteger = NumberUtil.isInteger(secondUserInputString);
        int secondUserInputInt = NumberUtil.stringToInteger(secondUserInputString, isSecondInputInteger);
        System.out.println("The second number you entered is: " + secondUserInputInt);

        int sum = firstUserInputInt + secondUserInputInt;
        System.out.println("***\nThe sum of these numbers is: " + sum);
        System.out.println("***\nThe multiplication result of these numbers is: " + firstUserInputInt * secondUserInputInt);
    }
}
