/*class Solution {
    public int arrangeCoins(int n) {
        int num=1;int counter=0;
        while(n>=num){
            counter++;
            n-=num;
            num++;
        }
        return counter;
    }
} */
/*class Solution {
    public int arrangeCoins(int n) {
        return (int)((Math.sqrt(8L * n + 1) - 1) / 2);
    }
}
 */