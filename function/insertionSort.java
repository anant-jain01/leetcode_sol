package function;

public class insertionSort {
    j++) {
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
