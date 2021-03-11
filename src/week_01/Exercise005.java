package week_01;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercise005 {
    public static void four() {
        for (int i = 1; i <= 21; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("\n****************************");
    }

    public static void five() {
        int counter = 1;

        while (counter < 21) {
            System.out.println("Counter = " + counter);
            counter++;
        }
        System.out.println("\n****************************");
    }

    public static void six() {
        int counter = 1;

        do {
            System.out.println("Counter = " + counter);
            counter++;
        } while (counter < 21);
        System.out.println("\n****************************");
    }

    public static void seven() {
        System.out.println("V02 - 7\n**********");
        System.out.println("N\t10*N\t100*N\t1000*N");
        System.out.println("--------------------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\t" + 10 * i + "\t" + 100 * i + "\t" + 1000 * i);
        }

    }

    public static void eight() {
        System.out.println("V02 - 8\n**********");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " is an odd number");
            } else {
                System.out.println(i + " is an even number");
            }
        }
    }

    public static void nine() {
        System.out.println("V02 - 9\n**********");

        int i = 0;
        while (i <= 20) {
            if (i % 2 == 1) {
                System.out.println(i + " is an odd number");
            } else {
                System.out.println(i + " is an even number");
            }
            i++;
        }
    }

    public static void ten() {
        System.out.println("V02 - 10\n**********");
        int i = 0;
        do {
            if (i % 2 == 1) {
                System.out.println(i + " is an odd number");
            } else {
                System.out.println(i + " is an even number");
            }
            i++;
        } while (i <= 20);
    }

    public static void eleven() {
        System.out.println("V02 - 11\n**********");
        int value = 1;
        for (int i = 0; i <= 10; i++) {
            value = value * 9;
            System.out.println("value = " + value);
            i++;
        }
    }

    public static void twelve() {
        System.out.println("V02 - 12\n**********");
        int i = 1;
        int natural_number = 1;
        int sum = 0;
        double average;

        while (i <= 20) {
            System.out.println(i + ". Natural number = " + natural_number);
            sum = sum + natural_number;
            average = Double.valueOf(sum) / Double.valueOf(i);
            System.out.println("Current sum = " + sum);
            System.out.println("Current average (sum (" + sum + ") / current amount of numbers (" + i + ") = " + average);
            System.out.println("--------------------");
            natural_number++;
            i++;
        }
    }

    public static void thirteen() {
        System.out.println("V02 - 13\n**********");
        int natural_number = 1;
        int sum = 0;
        double average;

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ". Natural number = " + natural_number);
            sum = sum + natural_number;
            average = Double.valueOf(sum) / Double.valueOf(i);
            System.out.println("Current sum = " + sum);
            System.out.println("Current average (sum (" + sum + ") / current amount of numbers (" + i + ") = " + average);
            System.out.println("--------------------");
            natural_number++;
        }
    }

    public static void fourteen(){
        System.out.println("V02 - 14\n**********");
        int sum = 0;

        for(int i = 0; i <=50; i++){

            if(i%7 == 0){
                sum = sum + i;
                System.out.println( i + " is divisible by 7. Sum = " + sum);
            } else{
                System.out.println(i + " is not divisible by 7");
            }
        }
    }

    public static void fifteen(){
        System.out.println("V02 - 15\n**********");
        int sum = 0;
        int i = 0;
        do{
            int square = i*i;
            if( square%2 == 1 ){
                sum = sum + square;
                System.out.println("Sum of all squares so far = " + sum);
            }
            i++;

        } while (i <= 10);
    }

    public static void sixteen(){
        System.out.println("V02 - 16\n**********");
        String[] arrayOfThings = new String[5];
        arrayOfThings[0] = "It's Friday, ";
        arrayOfThings[1] = "I'm";
        arrayOfThings[2] = "in";
        arrayOfThings[3] = "love";
        arrayOfThings[4] = "!";

        for( int i = 0; i<arrayOfThings.length; i++){
            System.out.println(arrayOfThings[i]);
        }
        System.out.println("\n****************************");
    }

    public static void seventeen(){
        System.out.println("V02 - 18\n**********");
        DecimalFormat df = new DecimalFormat("0.0");
        Random random = new Random();
        int MIN = 0;
        int MAX = 3;

        double grade1 = MIN + ((MAX - MIN) * random.nextDouble());
        if (grade1 < 0) {
            grade1 = grade1 * (-1);
        }
        System.out.println("grade1=" + grade1);

        double grade2 = MIN + ((MAX - MIN) * random.nextDouble());
        if (grade2 < 0) {
            grade2 = grade2 * (-1);
        }
        System.out.println("grade2=" + grade2);

        double grade3 = MIN + ((MAX - MIN) * random.nextDouble());
        if(grade2 < 0){
            grade3 = grade3*(-1);
        }
        System.out.println("grade2="+grade2);

        Double[] grades = new Double[3];
        grades[0] = grade1;
        grades[1] = grade2;
        grades[2] = grade3;

        double final_grade = 0.0;
        double sum = 0.0;
        for(int i = 0; i <= grades.length-1; i++){
            sum += grades[i];
            System.out.println(i+". sum = "+sum+". Grade = "+ grades[i]);
            final_grade = sum / i;
        }

        //System.out.println(Arrays.toString(grades));
        System.out.println(df.format(final_grade));
    }

    public static void nineteen(){
        System.out.println("V02 - 19\n**********");
        Integer[] values = new Integer[10];

        for(int i = 0; i <= values.length-1; i++){
            values[i] = (int)(Math.random() * 100);
            System.out.println(i + ". " + values[i]);
        }

        System.out.println("----");

        int highest = 0;

        int i = 0;

        while(i < values.length-1){
            if (highest < values[i]){
                highest = values[i];
                System.out.println(i + ". New Highest = " + highest);
            } else{
                System.out.println(i + ". Highest = " + highest);
            }
            i++;
        }
    }

    public static void twenty(){
        System.out.println("V02 - 20\n**********");
        Integer[] values = new Integer[10];
        int larger_than_ten = 10;
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(Math.random() * 20);
            System.out.println(i + ". " + values[i]);
        }
        System.out.println("---");
        for(int i=0;i < values.length; i++){
            if(values[i]>larger_than_ten){
                System.out.println(i + ". " + values[i]);
            }
        }
    }
}