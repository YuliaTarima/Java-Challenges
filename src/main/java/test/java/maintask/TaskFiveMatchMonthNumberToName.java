package test.java.maintask;

import utils.NumberUtil;
import utils.CalendarUtil;

import java.util.Scanner;
import java.lang.*;

public class TaskFiveMatchMonthNumberToName {
    public static void main(String[] args) {
        System.out.print("Please enter a number between 1 and 12!\n");
        Scanner firstScanner = new Scanner(System.in);
        String userInputString = firstScanner.nextLine();
        Boolean isInteger = NumberUtil.isInteger(userInputString);
        int userInputInteger = NumberUtil.stringToInteger(userInputString, isInteger);
        System.out.println("The number you entered is: " + userInputInteger);

        CalendarUtil.matchNumberToMonthWithSwitch(userInputInteger);

        String monthFromHashmap = CalendarUtil.matchNumberToMonthWithHashMap(userInputInteger);
        System.out.println("monthFromHashmap is " + monthFromHashmap);
        CalendarUtil.matchNumberToMonthWithArray(userInputInteger);
    }
}
