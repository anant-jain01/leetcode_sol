/*class Solution {
    public int findNumbers(int[] nums) {
        int count=0;int sum=0;
        for(int i:nums){
            while(i!=0){
                count++;
                i/=10;
            }
            if(count%2==0)sum+=1;
            count=0;
        }
        return sum;
    }
} */