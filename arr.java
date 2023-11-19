class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                a=i;
                break;
            }else{
                int flag=0;
                for(int j=0;j<nums.length;j++){
                    if(target<nums[j]){
                        flag=1;
                     a=j;
                      break;
                    }
                }
if(flag==0){
   a= nums.length;
}
            }
        }
        return a;
    }
}
public class arr{
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        Solution obj=new Solution();
        System.out.println(obj.searchInsert(arr, 5));

    }
}