import java.util.Scanner;

public class TestIfTheNumberIsInteger {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        boolean N = sc.hasNextInt();
        System.out.println(N);
        sc.close();
    }
    
}
