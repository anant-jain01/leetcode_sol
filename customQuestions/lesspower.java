package customQuestions;
import java.util.Scanner;
public class lesspower {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            System.out.println("target");
            int x=sc.nextInt();
            System.out.println(number(n,x));
        }
    }
    
}
