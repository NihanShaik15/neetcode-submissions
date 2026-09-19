class Solution {
    public int missingNumber(int[] nums) {
        int c=0;
        int n=nums.length;
        int k=n*(n+1)/2;
    for(int x:nums){
 c+=x;
    }
    return k-c;
    }
}
