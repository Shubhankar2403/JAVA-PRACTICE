import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Kilometers to be converted: ");
        double km = sc.nextDouble();
        double miles = 0.62137 *km;
        System.out.println(km + "Kilometer = " + miles + " Miles");
        sc.close();
    }
}
