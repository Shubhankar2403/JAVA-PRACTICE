import java.util.Scanner;

public class Greetings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your name here: ");
        String name = sc.nextLine();
        String greet = "Dear <!name>, thanks a lot.";
        System.out.println(greet.replace("<!name>", name));
    }
    
}
