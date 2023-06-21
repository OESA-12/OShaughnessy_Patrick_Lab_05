import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;
       // String trash = "";
        System.out.print("Enter the price of the item: ");
        if (in.hasNextDouble())
        {

        }
        itemPrice = in.nextInt();
        if (itemPrice < 100)
            shippingCost = itemPrice *0.02;
        System.out.println("Your shipping cost is " +shippingCost);
        totalCost = shippingCost + itemPrice;
        System.out.println("Your total cost is " +totalCost);


        if (itemPrice > 99.99);
        System.out.println("You do not have to pay shipping. ");



    }
}




