import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";
        System.out.print("Enter your birth month in number form: ");
        if (in.hasNextInt()) {
        }
        birthMonth = in.nextInt();
        if (birthMonth>12)
            System.out.println("Sorry I need a valid number between 1 and 12");
        else if (birthMonth <=12)
            System.out.println("You told me your birth month is " + birthMonth);

}
}