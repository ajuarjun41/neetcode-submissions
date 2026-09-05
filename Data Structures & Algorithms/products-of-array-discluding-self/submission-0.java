class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftArray = new int[n];
        int[] rightArray = new int[n];
        int[] result = new int[n];

        leftArray[0] =1;
        rightArray[n-1]=1;

        for(int i=1;i<n;i++){
            leftArray[i] =nums[i-1]*leftArray[i-1];        
        }

        for(int i=n-2;i>=0;i--){
            rightArray[i] =nums[i+1]*rightArray[i+1];  
        }

        for(int i=0;i<n;i++){
            result[i] =leftArray[i]*rightArray[i];        
        }

        return result;       
    }
}  
