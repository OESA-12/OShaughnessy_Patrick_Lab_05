import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter your age ");
        if (in.hasNextInt()) {
        }
        age = in.nextInt();
        if(age >=21)
            System.out.println("Take your wrist band. ");
        //else if (age <21);
    }

}