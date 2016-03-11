public class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[0];
        int count=1;
        for(int index=1;index<nums.length;index++){
            if(count==0){
                count++;
                majority=nums[index];
            }else if(majority==nums[index]){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }
}