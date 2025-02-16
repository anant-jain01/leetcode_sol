package function;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int[] arr=new int[i];
        for (int j = 0; j < i; j++) {
            System.out.println("number:");
            arr[j] = sc.nextInt();
        }
        int[] num=bubble(arr);
        System.out.println();
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }
    
    }
    public static int[] bubble(int[] arr){
        for(int j=0;j<arr.length;j++){
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
}
