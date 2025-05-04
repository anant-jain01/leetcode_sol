/*class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l_1=nums1.length;int l_2=nums2.length;
int[] arr=new int[l_1+l_2];
int i=0;int j=0;
while(i<l_1){
        arr[i]=nums1[i];
        i++;
}
while(j<l_2){
        arr[l_1+j]=nums2[j];
        j++;
}
Arrays.sort(arr);
int mid=(l_1+l_2)/2;
if((l_1+l_2)%2==0){
        return((arr[mid-1]+arr[mid])/2.0);
}
return arr[mid]/1.0;
}}*/