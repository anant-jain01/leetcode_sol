package function;
import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        int x=sc.nextInt();
        int[] arr=new int[x];
        while(x>=0){
            arr[x]=sc.nextInt();
        }
        System.out.println("target:");
        System.out.println(binary(int[] arr,target));
    }
}
}
