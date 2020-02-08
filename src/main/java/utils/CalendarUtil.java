package utils;

import java.util.HashMap;

public class CalendarUtil {
    private static HashMap<Integer, String> months = new HashMap<>();

    static {
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
    }

    private static String[] monthArray = new String[]
            {"January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"};

    public static boolean isBetweenOneToTwelve(int numberBetweenOneAndTwelve) {
        if (numberBetweenOneAndTwelve < 1 || numberBetweenOneAndTwelve > 12) {
            System.out.println("Incorrect number! Please enter a number between 1 and 12");
            return false;
        }
        return true;
    }

    public static void matchNumberToMonthWithSwitch(int numberBetweenOneAndTwelve) {
        if (isBetweenOneToTwelve(numberBetweenOneAndTwelve)) {
            //System.out.println("isBetweenOneToTwelve is: " + isBetweenOneToTwelve(numberBetweenOneAndTwelve));
            switch (numberBetweenOneAndTwelve) {
                case 1:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is January");
                    break;
                case 2:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is February");
                    break;
                case 3:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is March");
                    break;
                case 4:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is April");
                    break;
                case 5:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is May");
                    break;
                case 6:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is June");
                    break;
                case 7:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is July");
                    break;
                case 8:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is August");
                    break;
                case 9:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is September");
                    break;
                case 10:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is October");
                    break;
                case 11:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is November");
                    break;
                case 12:
                    System.out.println("Month that corresponds to the number " + numberBetweenOneAndTwelve + " is December");
                    break;
            }
        }

    }

    public static String matchNumberToMonthWithHashMap(int numberBetweenOneAndTwelve) {
        return months.get(numberBetweenOneAndTwelve);
    }

    public static void matchNumberToMonthWithArray(int numberBetweenOneAndTwelve) {
        if (isBetweenOneToTwelve(numberBetweenOneAndTwelve)) {
            for (int i = 0; i <= monthArray.length-1; i++) {
                int month = numberBetweenOneAndTwelve - 1;
                if (i == month) {
                    System.out.println("matchNumberToMonthWithArray: Month is " + monthArray[i]);
                }
            }
        }
    }
    private CalendarUtil() {}
    }
