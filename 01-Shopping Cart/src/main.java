import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        String item;
        double price;
        int quantity;
        Scanner scanner= new Scanner(System.in);
        System.out.println("what would you like to buy");
        item=scanner.next();
        System.out.println("what is the price for each?");
        price=scanner.nextInt();
        System.out.println("quantity?");
        quantity=scanner.nextInt();
        System.out.println("so you have bought " + quantity +" "+ item);
        double Total=quantity*price;
        System.out.println("your total bill will be " + Total);
        scanner.close();
    }

}
