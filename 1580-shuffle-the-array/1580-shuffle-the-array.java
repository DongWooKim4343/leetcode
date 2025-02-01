class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for(int i=0; i<n;i++){
            arrX[i]=nums[i];
            arrY[i]=nums[i+n];
        }
        int loop = 0;
        for(int i=0; i<nums.length;i+=2){
                nums[i]=arrX[loop++];
        }
        loop=0;
        for(int i=1; i<nums.length;i+=2){
                nums[i]=arrY[loop++];
        }
        return nums;

    }
}