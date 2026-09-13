import java.util.Scanner;
    public class Main{
        public static  void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            double weight;
            double newWeight;
            int choice;


            System.out.println("weight Conversion Program");
            System.out.println("1. Convert kgs to pounds");
            System.out.println("2. Convert pounds to kgs");
            System.out.print("Choose an option");
            choice= scanner.nextInt();

            if (choice==1)
            {
                System.out.println("You have chosen option 1 to convert weight from kgs to pounds");
                System.out.println("Enter Your Weight in kgs");
                weight=scanner.nextDouble();
                if (weight<0){
                    System.out.println("Invalid weight entered");
                }
                else {
                newWeight=weight*2.204;
                System.out.printf("the new weight is %.2f%n ", newWeight);
                }
            }
            else if (choice==2) {
                System.out.println("You have chosen option 2 to convert weight from pounds to kgs");
                System.out.println("Enter Your Weight in pounds");
                weight=scanner.nextDouble();
                if (weight<0){
                    System.out.println("Invalid weight entered");
                }
                else {
                    newWeight=weight/2.204;
                    System.out.printf("the new weight is %.2f%n ", newWeight);

                }
            }
            else
                System.out.println("Invalid Choice");
                
            }
        }