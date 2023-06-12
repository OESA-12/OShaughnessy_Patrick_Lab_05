import java.util.Scanner;
public class PartyAffiliation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean politicalParty;
        String party = " ";
        boolean rep = false;
        //boolean democrat = false;
        //boolean independent;
        String republican = "Republican";
        String democrat = "Democrat";
        String independent = "Independent";
        String other = "";
        String input;

        System.out.print("What is your political affiliation? ");
        input = in.nextLine();
        //System.out.println("You entered " + input);
        //System.out.println("Republican = " + republican);

        if (input.equals("Republican"))
            System.out.println("You get a Republican Elephant");
        if (input.equals("Democrat"))
            System.out.println("You Get a Democrat Donkey");
        if (input.equals("Independent"))
            System.out.println("You Get an Independent Person");
        if (input != democrat +  republican + independent)
             System.out.println("This is an invalid Choice you are Other");

            {
            }

            {
            }
        }


    }