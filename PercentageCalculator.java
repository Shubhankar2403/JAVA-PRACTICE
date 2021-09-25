import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 5: ");
        float sub5 = sc.nextFloat();
        float percent = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
        System.out.println("The percentage of the student is: " +percent);
        sc.close();
    }
}