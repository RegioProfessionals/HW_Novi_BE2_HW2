import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        String name;
        int input1;
        int input2;
        hello();
        positiveOrNegative(-1);
        positiveOrZeroOrNegative(0);
        bartender("Tom");
        sum(4,20);

        //BONUS-Opdrachten
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer een getal in: ");
        int givenNumber = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Voer een text in: ");
        String givenText = sc1.nextLine();

        evenUnevenChecker(givenNumber);
        textLengthChecker(givenText);
    }

    public static void hello() {
        System.out.println("Hello World!");
    }

    public static boolean positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
            return true;
        } else if (number < 0) {
            System.out.println("This number is negative!");
            return true;
        } else {
            System.out.println("This number is positive nor negative!");
            return false;
        }
    }

    public static boolean positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
            return true;
        }
        else if (number == 0) {
            System.out.println("This number is zero!");
            return true;
        } else {
            System.out.println("This number is negative!");
            return true;
        }
    }

    public static void bartender(String name) {
        switch (name) {

            case "Henk":
                System.out.println("Water");
                break;
            case "Jeff":
                System.out.println("Jack Daniels");
                break;
            case "Vince":
                System.out.println("Bacardi Cola");
                break;
            default:
                System.out.println("Some other drink");

        }

    }

    public static int sum(int input1, int input2) {
        System.out.println("The sum of " + input1 + " and " + input2 +" = " + (input1 + input2));
        return input1+input2;
    }

    //  BONUS-Opdrachten

    public static boolean evenUnevenChecker(int givenNumber) {
        if (givenNumber == 0) {
            System.out.println("The number you gave me is: Even nor uneven!");
            return false;
        } else if (givenNumber % 2 != 0) {
            System.out.println("The number you gave me is: Uneven!");
            return true;
        } else {
            System.out.println("The number you gave me is: Even!");
            return true;
        }
    }

    public static boolean  textLengthChecker(String givenText) {
        if (givenText.length() < 15) {
            System.out.println("The text is: Short!");
            return true;
        } else if (givenText.length() > 20) {
            System.out.println("The text is: Long!");
            return true;
        } else {
            System.out.println("The text is: Medium!");
            return true;
        }

    }

}