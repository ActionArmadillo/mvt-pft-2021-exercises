package week_01;

import java.util.Scanner;

public class Exercise004 {

    public static void seven(){
        int age;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Age? ");
        age = Integer.parseInt(inputValue.nextLine());

        if (age >= 18){
            System.out.println("Not a minor.");
        } else
            System.out.println("Minor!");

        inputValue.close();
    }

    public static void eightA(){
        int a, b;
        a = 10;
        b = 20;
        System.out.println("a = "+ a + ". b = " + b);
        System.out.println("**waves magic wand**");

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a is now = " + a + ". b is now = " + b);
    }

    public static void eightB(){
        int brl = (int)(Math.random() * 1000);
        double sek = (double)brl * 2.64;
        System.out.println(brl + " BRL equals " + sek + " SEK.");
    }

    public static void eightC(){
        double a = (double)(Math.random() * 1000);
        double b = (double)(Math.random() * 1000);

        System.out.println("a = " + a + ". b = " + b + ".");
        // sum
        System.out.println("Sum of a + b = " + (a+b));
        // subtraction
        System.out.println("Subtraction of b from a (a - b) = " + (a-b));
        // multiplication
        System.out.println("Multiplication of b and a = " + (a*b));
        // division
        System.out.println("Division of a by b (a / b) = " + (a/b));
        //division by 0
        System.out.println("a / 0 = " + (a/0));
    }

    public static void eightD(){
        Scanner value = new Scanner(System.in);
        System.out.println("How many degrees Celsius?");
        double celcius = Integer.parseInt(value.nextLine());
        double fahrenheit = celcius * 1.8 + 32;

        System.out.println("The temperature is " + fahrenheit + " degrees fahrenheit.");
        value.close();
    }

    public static void eightE(){
        Scanner value = new Scanner(System.in);
        System.out.println("What is the price of the item?");
        double price = Double.parseDouble(value.nextLine());
        double discount = price * 0.13;
        System.out.println("The discounted price is " + (price - discount) + " simoleons");
        value.close();
    }
}
