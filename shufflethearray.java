/*class Solution {
    public int[] shuffle(int[] num, int n) {
        int[] arr=new int[num.length];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = num[i];       
            arr[2 * i + 1] = num[i + n];
        }
        return arr;
    }
} */