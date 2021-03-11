import week_05.exercise_016_05.Circle;
import week_05.exercise_016_05.Triangle;
import week_05.exercise_016_06.Female;
import week_05.exercise_016_06.Male;
import week_05.exercise_016_06.OtherGender;
import week_05.exercise_017_02.ScientificCalculator;
import week_05.exercise_017_03.Computer;
import week_05.exercise_017_03.Laptop;
import week_05.exercise_017_03.StationaryComputer;
import week_05.exercise_017_04.BankAccount;
import week_05.exercise_017_04.PersonalAccount;
import week_05.exercise_017_04.SavingAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //gender();
        //calculate();
        //computers();
        accounts();
    }

    public static void triangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type the value of the base of the triangle");
        double base = input.nextDouble();
        System.out.println("Please type the value of the height of the triangle");
        double height = input.nextDouble();
        Triangle t = new Triangle(base, height);
        System.out.println("Let's calculate the area of your triangle");
        System.out.println(t.computeArea());
        input.close();
    }

    public static void circle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type the value of the radius of the circle");
        double radius = input.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("Let's calculate the area of your circle");
        System.out.println(c.computeArea());
        input.close();
    }

    public static void gender(){
        Male male = new Male("Peter", 30);
        Female female = new Female("Joan", 55);
        OtherGender otherGender = new OtherGender("Joey", 20);

        male.printClassName();
        female.printClassName();
        otherGender.printClassName();
    }

    public static void calculate(){
        ScientificCalculator sc = new ScientificCalculator();
        System.out.println(sc.remainder(333, 223));
    }

    public static void computers(){
        Computer computer = new Computer();
        StationaryComputer sc = new StationaryComputer();
        Laptop l = new Laptop();

        computer.turnOn();
        computer.performDownload();
        computer.turnOff();

        l.turnOn();
        l.performUpload();
        l.turnOff();

        sc.turnOn();;
        sc.playVideo();
        sc.playMusic();
        sc.turnOff();
    }

    public static void accounts(){
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.toString());
        bankAccount.depositMoney(200.0);
        System.out.println("----------------------------------------------------------");

        PersonalAccount personalAccount = new PersonalAccount();
        personalAccount.depositMoney(70.0);
        System.out.println(personalAccount.toString());
        personalAccount.depositMoney(-1.0);
        System.out.println("----------------------------------------------------------");

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.withdrawMoney(10.0);
        savingAccount.depositMoney(100.0);
        savingAccount.withdrawMoney(10.0);
        System.out.println(savingAccount.toString());
    }
}
