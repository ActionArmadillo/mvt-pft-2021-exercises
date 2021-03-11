package week_02;

import java.util.Random;
import java.util.Scanner;

public class Exercise007 {
    public static void one() {
        System.out.println("==== 1 ====");
        Scanner input = new Scanner(System.in);
        System.out.println("State your name.");
        String name = input.nextLine();
        System.out.println("Your name is " + name.length() + " characters long");
        input.close();
    }

    public static void two() {
        System.out.println("==== 2 ====");
        String firstString = "Hubba hubba zoot zoot";
        String secondString = "Yabba dabba doo";

        if (firstString.toLowerCase().equals(secondString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void three() {
        System.out.println("==== 3 ====");
        String firstString = "Hubba hubba zoot zoot";
        String secondString = "Yabba dabba doo";

        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void four() {
        System.out.println("==== 4 ====");
        String text = "Rafaelli";
        if (text.startsWith("Rafa")) {
            System.out.println("String " + text + " starts with Rafa");
        } else {
            System.out.println("String " + text + " does not start with Rafa");
        }
    }

    public static void five() {
        System.out.println("==== 5 ====");
        String text = "Arafat";
        if (text.endsWith("rafa")) {
            System.out.println("String " + text + " ends with rafa");
        } else {
            System.out.println("String " + text + " does not end with rafa");
        }
    }

    public static void six() {
        System.out.println("==== 6 ====");
        int counter = 1;
        Random random = new Random();
        int value = 0;

        do {
            value = random.nextInt(10);
            System.out.println(counter + ". " + value);
            counter++;
        } while (counter <= 10);
    }

    public static void seven() {
        System.out.println("==== 7 ====");

        double sum = 0;
        Double[] arr = new Double[10];

        for (int i = 0; i <= 9; i++) {

            double value = Math.random() * 100;
            if (value < 0) {
                value = value * (-1);
            }
            arr[i] = value;
            sum += arr[i];
            System.out.println("Value at array index " + i + " = " + arr[i]);
            System.out.println("Sum of the values in the array so far = " + sum);
        }
        double avg = (double) (sum / arr.length);
        System.out.println("==== 8 ====");
        System.out.println("\n=======================");
        System.out.println("Total sum = " + sum + ".");
        System.out.format("The average of the values in the array = %.2f", avg);

    }

    public static void eight() {
        System.out.println("==== 9 ====");
        double value = 10.0;
        double divider = 0.84;

        System.out.println(value + " / " + divider + " = " + (value / divider) + ". Rounded answer = " + Math.round(value / divider));

    }

    public static void nine() {
        System.out.println("==== 10 ====");
        int exponent = 10;
        System.out.println("2 to the power of " + exponent + " = " + Math.pow(2, exponent));
    }

    public static void ten() {
        double radius = Math.random() * 5.0;
        double circle = Math.PI * Math.pow(radius, 2);
        System.out.println("The are of a circle with radius = " + radius + " equals " + circle);

    }

    public static void eleven() {
        System.out.println("==== 11 ====");
        Random random = new Random();
        int[] arr = new int[30];
        int countFive = 0;

        for (int i = 0; i < 30; i++) {
            arr[i] = random.nextInt(10);
            System.out.println(i + ". " + arr[i]);
            if (arr[i] == 5) {
                countFive++;
            }
        }
        int key = 5;
        System.out.println("The array contains " + countFive + " fives.");
    }

    public static void twelve() {
        System.out.println("==== 12 ====");
        boolean[] arrayOfOpinions = new boolean[10];
        Random random = new Random();
        int real = 0;
        int hoax = 0;

        for (int i = 0; i <= 9; i++) {
            arrayOfOpinions[i] = random.nextBoolean();
            if (arrayOfOpinions[i] == true) {
                real++;
            } else {
                hoax++;
            }
        }

        System.out.println("Believers: " + real);
        System.out.println("Non-believers: " + hoax);
    }

    public static void thirteen() {
        System.out.println("==== 13 ====");

        Random random = new Random();
        int factorial = random.nextInt(10);
        int value = factorial;

        for (int i = 1; i <= factorial; i++) {

            value = value * i;
            System.out.println(i + ", " + value);

        }

        System.out.println("Factorial of " + factorial + " = " + value);
    }

    public static void fourteen() {
        System.out.println("==== 13 ====");
        Random random = new Random();
        int degrees = random.nextInt(360);
        double radians = Math.toRadians(degrees);

        System.out.println("degrees = " + degrees);
        System.out.printf("radians = %.2f", radians);
    }

    public static void fifteen() {
        System.out.println("==== 13 ====");
        Random random = new Random();
        double radians = random.nextDouble();
        double degrees = Math.toRadians(radians);

        System.out.printf("degrees = %.2f", degrees);
        System.out.println();
        System.out.printf("radians = %.2f", radians);
    }

    public static void sixteen() {
        int ageUser1 = 0;
        int ageUser2 = 0;

        Random random = new Random();
        ageUser1 = random.nextInt(50);
        ageUser2 = random.nextInt(50);

        System.out.println("User1 is " + ageUser1 + " years old.");
        System.out.println("User2 is " + ageUser2 + " years old.");

        if (ageUser1 == ageUser2) {
            System.out.println("The users have walked an equal amount of years on this earth.");
        } else {
            System.out.println(Math.max(ageUser1, ageUser2) + " is older than " + Math.min(ageUser1, ageUser2));
        }
    }
}
