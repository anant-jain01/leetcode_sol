package function;
import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        int x=sc.nextInt();
        int[] arr=new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("target:");
        int target=sc.nextInt();
        System.out.println(binary(arr,target));
    }
}
    public static int binary(int[] arr,int target){
        int low=0;int high=arr.length-1;
        while(low<=high){
            int mid=low-(high+low)/2;
            if(arr[mid]==target)
            return mid;
            else if(arr[mid]>target)
            high=mid-1;
            else
            low=mid+1;
        }
        return -1;

}
}
