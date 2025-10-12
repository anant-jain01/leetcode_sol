/*class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst=new ArrayList<>();
        int numax=0;
        for(int i=0;i<candies.length;i++){
            numax=Math.max(candies[i],numax);
        }
        for(int i=0;i<candies.length;i++){
            lst.add(candies[i] + extraCandies >= numax);
        }
        return lst;
    }
} */