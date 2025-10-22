/*class Solution {
    public int searchInsert(int[] nums, int target) {
        int high=nums.length-1;int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                if(mid==0||nums[mid-1]<target){
                    return mid;
                }
                high=mid-1;
            }
            else if(nums[mid]<target){
                if(mid==nums.length-1||nums[mid+1]>target)
                return mid+1;
            low=mid+1;
        }
        else
        return mid;
        }
        return low;}} */