class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        int nums2[];
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;i<nums.length-1;j++){
                if(nums[i]==nums[j]){
                    a++;
                    nums[i]=nums[i+1];
                }
            }
        }
        int l=nums.length-a;
        for(int o=0;o<l;o++){
            nums2[o]=nums[o];
        }
     return nums2.length;
    }
}