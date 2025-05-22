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
}