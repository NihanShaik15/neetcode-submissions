class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,rmax=0,rmin=0,wa=0;
      while(left<right){
        if(height[left]<height[right]){
           if(height[left]>=rmin){
            rmin=height[left];
           }
           else{
            wa+=rmin-height[left];

           }
           left++;
           
        }
        else{
            if(height[right]>=rmax){
                rmax=height[right];
            }
            else{
                wa+=rmax-height[right];
            }
            right--;
        }
      }
      return wa;
    }
}
