class Solution {
    public int singleNumber(int[] nums) {
        int[] counts =new int[60000];
        int answer = 0;

        for(int i = 0 ; i < nums.length; i++){
            counts[nums[i]+30000]+=1;
        }
        for(int i = 0; i<counts.length; i++){
            if(counts[i]==1){
                return answer=i-30000;
            }
        }
        return answer;
    }
}