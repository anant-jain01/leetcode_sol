package function;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();int[] arr=new int[i];
        while(i>0){
            arr[i-1]=sc.nextInt();
            i--;
        }
        int[] new=bubble(arr);
        while(i<=arr.length){
            System.out.println(new[i-1]);
        }
    }
}
