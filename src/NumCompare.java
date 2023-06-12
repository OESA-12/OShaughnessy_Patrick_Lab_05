import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        String input;
        System.out.print("Enter a number ");
        input = in.nextLine();
        //if (in.hasNextInt()) {
        //}
        //number1 = in.nextInt();
        System.out.print("Enter a number ");
        // input = in.nextLine();
        if (in.hasNextInt()) {
        }
        number1 = in.nextInt();
        in.nextLine();
        System.out.println("number 1 " + number1);
        System.out.println("number 2 " + number2);

        if (number1 == number2)
            System.out.println("Your numbers are equal to each other");

        else if (number1 > number2)
            System.out.println("Your first number is larger than the second one");

        else if (number1 < number2) ;

    System.out.println("Your first number is smaller than the second");

}
}
