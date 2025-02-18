package function;
import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("no of elements:");
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("number:");
                arr[i]=sc.nextInt();
            }
            int[] nya=insertion(arr);
            for (int j = 0; j < arr.length; j++) {
                System.out.println(nya[j]);
            }
        }}
        public static int[] insertion(int[] arr){
            for (int j = 1; j < arr.length; j++) {
                for (int i = j; i > 0 ; i--){
                    if(arr[i]<arr[i-1]){
                        int temp=arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]=temp;
                    }
                }
            }
            return arr;
    }
}
