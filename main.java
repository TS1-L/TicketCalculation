import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fee, discount;
        System.out.println("Enter the distance: ");
        int distance = input.nextInt();
        System.out.println("For one way trip press 1");
        System.out.println("For round way trip press 2");
        int tripType = input.nextInt();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        double perKM = 0.10;

        fee = distance * perKM;
        if (tripType == 1) {

            if (age < 12) {
                discount = fee;
                discount *= 0.5;
                fee -= discount;
            }
            else if (age >= 12 && age < 24) {
                discount = fee;
                discount *= 0.1;
                fee -= discount;

            }
            else if (age >= 65) {
                discount = fee;
                discount *= 0.3;
                fee -= discount;
            }
        }
        else if (tripType == 2) {
            if (age < 12) {
                discount = fee;
                discount *= 0.5;
                fee -= discount;
                discount = fee;
                discount *= 0.2;
                fee -= discount;
                fee *=2;
            }
            else if (age >= 12 && age < 24) {
                discount = fee;
                discount *= 0.1;
                fee -= discount;
                discount = fee;
                discount *= 0.2;
                fee -= discount;
                fee *=2;
            }
            else if (age >= 65) {
                discount = fee;
                discount *= 0.3;
                fee -= discount;
                discount = fee;
                discount *= 0.2;
                fee -= discount;
                fee *=2;
            }
            else {
                discount = fee;
                discount *= 0.2;
                fee -= discount;
                fee *=2;
            }

        }
        else {
            System.out.println("Invalid trip type!");
        }
        System.out.println("The fee is " + fee);



    }
}
