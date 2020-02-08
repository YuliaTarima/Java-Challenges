package test.java.maintask;

import utils.StringUtil;

import java.util.Scanner;

public class TaskTwoReverseString {

    public static void main(String[] args) {
        System.out.println("Please enter a word");

        try (Scanner scanner = new Scanner(System.in)) {
            String inputString = scanner.nextLine();
            StringUtil.checkNotEmpty(inputString);
            System.out.printf("%n***%nThe word you entered is: %s", inputString);

            String reversedString = StringUtil.reverseStringWithStringBuilder(inputString);
            System.out.printf("%n***%nreverseStringWithStringBuilder%nYour name in reversed order is %s", reversedString);

            reversedString = StringUtil.reverseStringWithCharArray(inputString);
            System.out.printf("%n***%nreverseStringWithCharArray%nYour name in reversed order is %s", reversedString);

            reversedString = StringUtil.reverseStringWithCharSwapping(inputString);
            System.out.printf("%n***%nreverseStringWithCharSwapping%nYour name in reversed order is %s", reversedString);
        }
    }


}
