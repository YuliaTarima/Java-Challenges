package test.java.maintask;

import utils.NumberUtil;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class TaskThreeGenerateRandomNumbers {

    public static void main(String[] args) {
        System.out.print("How many numbers do you want to output?\n");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Boolean isInteger = NumberUtil.isInteger(inputString);
        int amountOfRandomNumbers = NumberUtil.stringToInteger(inputString, isInteger);
        System.out.println("Your amount of random numbers will be: " + amountOfRandomNumbers);

        ArrayList<Integer> integerArrayList = NumberUtil.createIntArrayWithSize(amountOfRandomNumbers);
        NumberUtil.printIntegerArrayListInSingleLine(integerArrayList);
        NumberUtil.printIntegerArrayListItemPerLine(integerArrayList);
        NumberUtil.calculateSumOfArrayListIntegers(integerArrayList);

        NumberUtil.printRandomNumbersNTimesOneLiner(amountOfRandomNumbers);
        NumberUtil.printRandomNumbersNTimesOneItemPerLine(amountOfRandomNumbers);
        NumberUtil.multiplyNAmountOfRandomNumbers(amountOfRandomNumbers);
    }
}
