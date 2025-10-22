/*class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean check[]= new boolean[1001];

        for(int i:nums1)
            check[i]= true;

        int[] ans= new int[1001];

        int j=0;
        for(int i: nums2)
            if(check[i]){
                ans[j]=i;
                j++;
                check[i]=false;
            }
        
        return Arrays.copyOf(ans,j);
    }
} */