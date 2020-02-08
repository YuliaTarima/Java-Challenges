package utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class NumberUtil {

    public static boolean isInteger(String inputString) {
        inputString = inputString.trim();
        System.out.println(inputString);

        try {
            Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            System.out.println("Please, provide a valid integer!");
            return false;
        } catch (NullPointerException e) {
            System.out.println("Please, provide a valid integer!");
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    public static int stringToInteger(String inputString, Boolean isInteger) {

        if (!isInteger) {
            System.out.println("stringToInteger: This is not an integer!");
            return -1;
        } else {
            return Integer.parseInt(inputString);
        }
    }

    public static int generateRandomInteger() {
        Random random = new Random();

        // Generate random integers in range 0 to 999
        int randomInteger = random.nextInt(1000);
        return randomInteger;
    }

    public static ArrayList<Integer> createIntArrayWithSize(int intArraySize) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        if (intArraySize != -1) {
            for (int i = 0; i <= intArraySize - 1; i++) {
                int randomInteger = generateRandomInteger();
                integerArrayList.add(randomInteger);
            }
        }
        return integerArrayList;
    }

    public static void printIntegerArrayListInSingleLine(ArrayList<Integer> integerArrayList) {
        System.out.println("\n***\nprintIntegerArrayListInSingleLine:");
        for (Integer item : integerArrayList) {
            System.out.print(item + " ");
        }
    }

    public static void printIntegerArrayListItemPerLine(ArrayList<Integer> integerArrayList) {
        System.out.println("\n\n***\nprintIntegerArrayListItemPerLine:");
        for (Integer item : integerArrayList) {
            System.out.println(item + " ");
        }
    }

    public static void printRandomNumbersNTimesOneLiner(int amountOfOutputs) {
        Random random = new Random();

        Integer[] result = Stream
                .generate(() -> random.nextInt(1000))
                .limit(amountOfOutputs)
                .toArray(Integer[]::new);

        //System.out.println("\n***\nprintRandomNumbersNTimesOneLiner:\n" + Arrays.asList(result));
        System.out.println("\n***\nprintRandomNumbersNTimesOneLiner:");
        for (Integer item : result) {
            System.out.print(item + " ");
        }
    }

    public static void printRandomNumbersNTimesOneItemPerLine(int amountOfOutputs) {
        Random random = new Random();

        Integer[] result = Stream
                .generate(() -> random.nextInt(1000))
                .limit(amountOfOutputs)
                .toArray(Integer[]::new);

        System.out.println("\n\n***\nprintRandomNumbersNTimesOneItemPerLine:");
        for (Integer item : result) {
            System.out.println(item + " ");
        }
    }

    public static void calculateSumOfArrayListIntegers(ArrayList<Integer> integerArrayList) {

        int sum = 0;
        for (int i = 0; i < integerArrayList.size(); i++) {
            sum += integerArrayList.get(i);
            //System.out.println("Iteration: " + i + "; sum is " + sum);
        }
        System.out.println("\n***\ncalculateSumOfArrayListIntegers: " + sum);
    }

    public static void multiplyNAmountOfRandomNumbers(int amountOfOutputs) {
        Random random = new Random();

        Integer[] result = Stream
                .generate(() -> random.nextInt(1000))
                .limit(amountOfOutputs)
                .toArray(Integer[]::new);

        System.out.println("\n***\nmultiplyNAmountOfRandomNumbers:");
        System.out.print("Random Numbers are: ");
        BigInteger multiplicationResult = BigInteger.ONE;
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            if(result[i] > 0)
            multiplicationResult = multiplicationResult.multiply(BigInteger.valueOf(result[i]));
            //System.out.println("Iteration: " + i + "; multiplicationResult is " + multiplicationResult);
        }
        System.out.println("\nMultiplication result is: " + multiplicationResult);
    }

    private NumberUtil() {}

}
