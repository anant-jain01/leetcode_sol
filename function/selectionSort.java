package function;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int i=sc.nextInt();
        int[] arr=new int[i];
        for (int j = 0; j < i; j++) {
            System.out.println("number:");
            arr[j] = sc.nextInt();
        }
        int[] num=selection(arr);
        System.out.println();
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }
    }
    }    
    
}
