public class RotateArray {
   /*class Solution {
        public int[] reverse(int[] nums,int left,int right){
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return nums;
        }
        public void rotate(int[] nums, int k) {
            k%=nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,k,nums.length-1);
            reverse(nums,0,k-1);
        }
    }*/
}
