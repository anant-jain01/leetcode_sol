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
    public static int number(int power,int target){
        int low=0;int high=target;int best=0;
        while(low<high){
            int mid=low+(high-low)/2;
            if(Math.pow(mid,power)==target){
                return mid;
            }
            else if(Math.pow(mid,power)>target)
            high=mid-1;
            else{
            low=mid+1;
            best=mid;
        }}
        return best;
    }
}
