package week_02;

import java.util.*;

public class Exercise008 {
    public static void one() {
        System.out.println("==== 01 ====");
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(20);
            arr2[i] = random.nextInt(20);

            System.out.println("STEP " + (i + 1) + "\n=============================");
            System.out.println("Arr1: = " + Arrays.toString(arr1));
            System.out.println("Arr2: = " + Arrays.toString(arr2));
            System.out.println("=============================");
        }

        System.out.println("Sorting...");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Arr1: = " + Arrays.toString(arr1));
        System.out.println("Arr2: = " + Arrays.toString(arr2));
        System.out.println("=============================\n");
    }

    public static void three() {
        System.out.println("==== 03 ====");

        Random random = new Random();
        ArrayList<Integer> intArray = new ArrayList<Integer>(10);
        int counter = 0;

        while (counter < 15) {
            intArray.add(random.nextInt(10));
            counter++;
        }

        System.out.println("Array\n==========");
        System.out.println(intArray);

        System.out.println("Is there a 1 before a 2");
        if (intArray.contains(1) && intArray.contains(2)) {
            int index1 = intArray.indexOf(1);
            int index2 = intArray.indexOf(2);

            if (index1 < index2) {
                System.out.println("1 came before 2, 1 has index " + index1 + ", 2 has index " + index2);
            } else {
                System.out.println("1 was not found before 2.");
            }

        } else {
            if (!intArray.contains(1)) {
                System.out.println("1 does not exist in the array.");
            }
            if (!intArray.contains(2)) {
                System.out.println("2 does not exist in the array.");
            }
        }
    }

    public static void four() {
        System.out.println("==== 04 ====");

        Random random = new Random();
        ArrayList<Integer> intArray = new ArrayList<Integer>(10);
        int counter = 0;

        while (counter < 10) {
            intArray.add(random.nextInt(20));
            counter++;
        }

        int frequency = 0;
        if (intArray.contains(5)) {
            for (int temp : intArray) {         // enhanced for!
                if (temp == 5) {
                    frequency++;
                }
            }
            System.out.println(intArray + " contains " + frequency + " '5'.");
        } else {
            System.out.println("No fives for you");
        }
    }

    public static void five() {
        System.out.println("==== 05 ====");

        Random random = new Random();
        ArrayList<Integer> intArray1 = new ArrayList<Integer>(10);
        ArrayList<Integer> intArray2 = new ArrayList<Integer>(10);
        int counter = 0;

        while (counter < 10) {
            intArray1.add(random.nextInt(19) + 1);
            intArray2.add(random.nextInt(19) + 21);
            counter++;
        }
        //System.out.println("==== Arrays ====");
        //System.out.println("Array1 = " + intArray1);
        //System.out.println("Array2 = " + intArray2);

        ArrayList<Integer> mergedArray = new ArrayList<Integer>();
        for (int i = 0; i < intArray1.size(); i++) {
            int temp1 = intArray1.get(i);
            int temp2 = intArray2.get(i);
            //System.out.println(i + ". " + temp1 + ", " + temp2);
            mergedArray.add(temp1);
            mergedArray.add(temp2);
            //System.out.println("Arrays merged = " + mergedArray);
        }
        System.out.print("Array1 = " + intArray1 + "\n");
        System.out.print("Array2 = " + intArray2 + "\n");
        System.out.print("Arrays merged = " + mergedArray);

    }

    public static void six() {
        System.out.println("==== 06 ====");

        ArrayList<Character> chars = new ArrayList<Character>();
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Tenent mordicus. Plane idem, inquit, et maxima quidem, qua fieri nulla maior potest. " +
                "Hoc est non dividere, sed frangere. Duo Reges: constructio interrete. " +
                "Propter nos enim illam, non propter eam nosmet ipsos diligimus. " +
                "Conferam tecum, quam cuique verso rem subicias; " +
                "Naturales divitias dixit parabiles esse, " +
                "quod parvo esset natura contenta. Nulla erit controversia";

        for (char c : loremIpsum.toCharArray()) {
            chars.add(c);
        }
        System.out.println(chars);

        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        int counter = 0;

        for (int i = 0; i < chars.size(); i++) {
            for (int j = 0; j < vowels.size(); j++) {
                char v = vowels.get(j);
                char c = chars.get(i);
                if (v == c) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void seven() {
        System.out.println("==== 07 ====");

        final int CAPACITY = 10;
        ArrayList<Integer> ints = new ArrayList<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            ints.add(i);
        }
        Collections.shuffle(ints);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 9");

        int counter = 3;
        do {
            if (ints.get(5) == input.nextInt()) {
                System.out.println("You won the game and get a prize.");
                break;
            } else {
                counter--;
                System.out.println("No prize for you. " +
                        "You have " + counter + " guesses left.");
            }
        } while (counter > 0);
        System.out.println(ints);
    }

    public static void eigth() {
        Random random = new Random();
        int CAPACITY = 50;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        ArrayList<Integer> valueArray = new ArrayList<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            valueArray.add(random.nextInt(3));
            if (valueArray.get(i) == 0) {
                countZero++;
            } else if (valueArray.get(i) == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }

        System.out.println("Pick a number between 0 and 2.");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        boolean mostZeroes = false;
        boolean mostOnes = false;
        boolean mostTwos = false;

        if ((countZero > countOne) && (countZero > countTwo)) {
            mostZeroes = true;
        }
        if ((countOne > countZero) && (countOne > countTwo)) {
            mostOnes = true;
        }
        if ((countTwo > countOne) && (countTwo > countZero)) {
            mostTwos = true;
        }

        if (number < 0 || number > 2) {
            System.out.println("Invalid input.");
        } else if (number == 0 && mostZeroes) {
            System.out.println("0 was correct! Prize!");
        } else if (number == 1 && mostOnes) {
            System.out.println("1 was correct Prize!");
        } else if (number == 2 && mostTwos) {
            System.out.println("2 was correct! Prize!");
        } else {
            System.out.println("The number you picked was not the most frequent. No prize.");
        }

        System.out.println(countZero + " occurrences of 0.");
        System.out.println(countOne + " occurrences of 1.");
        System.out.println(countTwo + " occurrences of 2.");

    }
}
