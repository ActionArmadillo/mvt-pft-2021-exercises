package week_02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise006 {
    public static void test() {
        Integer[] arr = new Integer[5];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void two() {
        System.out.println("\t- 2 -");
        Integer[] arr = new Integer[20];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Type f, w och d to re-sort the array.");

        Scanner inputValue = new Scanner(System.in);
        String userInput = inputValue.nextLine();
        int counter = arr.length - 1;

        switch (userInput) {
            case "f":
                System.out.println("For!");
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (i > 0) {
                        System.out.print(arr[i] + ", ");
                    } else {

                        System.out.print(arr[i] + ".\n");
                    }
                }
                //System.out.println("Bye!");
                break;

            case "w":
                System.out.println("While!");
                while (counter >= 0) {
                    if (counter > 0) {
                        System.out.print(arr[counter] + ", ");
                    } else {
                        System.out.print(arr[counter] + ".\n");
                    }
                    counter--;
                }
                break;

            case "d":
                System.out.println("Do-while!");
                do {
                    if (counter > 0) {
                        System.out.print(arr[counter] + ", ");
                    } else {
                        System.out.print(arr[counter] + ".\n");
                    }
                    counter--;
                } while (counter >= 0);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        inputValue.close();
    }

    public static void two_wrong_solution() {
        Integer[] arr = new Integer[20];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Type f, w och d to re-sort the array.");

        Scanner inputValue = new Scanner(System.in);
        String userInput = inputValue.nextLine();
        int counter = 0;

        switch (userInput) {
            case "f":
                System.out.println("For!");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr.length - i;
                }
                System.out.println(Arrays.toString(arr));
                break;

            case "w":
                System.out.println("While!");
                while (counter < arr.length) {
                    arr[counter] = arr.length - counter;
                    counter++;
                }
                System.out.println(Arrays.toString(arr));
                break;

            case "d":
                System.out.println("Do-while!");
                do {
                    arr[counter] = arr.length - counter;
                    counter++;
                } while (counter < arr.length);
                System.out.println(Arrays.toString(arr));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        inputValue.close();
    }

    public static void three() {
        System.out.println("\t- 3 -");
        System.out.println("Please type one word.");

        Scanner inputValue = new Scanner(System.in);
        String word = inputValue.nextLine();
        int strLength = word.length();
        boolean palindrome = true;

        // check if char at char (index = counter) is the same as position at (end of string - counter)
        // if not the same, break the loop
        for (int counter = 0; counter <= strLength - 1; counter++) {
            if (word.toLowerCase().charAt(counter) != word.toLowerCase().charAt((strLength - 1) - counter)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("The word " + word + " is a palindrome");
        } else {
            System.out.println("The word " + word + " is not a palindrome");
        }
        inputValue.close();
    }

    public static void four() {
        System.out.println("\t- 4 -");
        Random random = new Random();
        int arrValue = 0;
        int counter = 0;


        Integer[] arr = new Integer[5];
        int lastIndex = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            arrValue = random.nextInt(5);
            arr[i] = arrValue;
        }
        System.out.println("Generating array...");
        System.out.println(Arrays.toString(arr));

        System.out.println("==== Zero magic ====");

        while (counter <= arr.length - 1) {
            if (arr[lastIndex] == 0) {
                arr[lastIndex] = arr[0];
            }
            if (arr[counter] == 0) {
                arr[counter] = arr[counter + 1];
            }
            counter++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void five() {
        System.out.println("\t- 5 -");

        int[] arr_a = {1, 2, 3, 4, 5};
        int[] arr_b = {8, 16, 24, 32, 40};
        int[] arr_c = {5, 7, 3, 9, 11};

        boolean asc = true;

        for (int i = 0; i <= arr_c.length - 2; i++) {
            if (arr_c[i] >= arr_c[i + 1]) {
                asc = false;
                break;
            }
        }

        System.out.println(Arrays.toString(arr_c));

        if (asc) {
            System.out.println("The values in the array are in ascending order");
        } else {
            System.out.println("The values in the array are not in ascending order");
        }
    }
}
