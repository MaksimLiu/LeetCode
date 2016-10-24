public class Solution {
    public int singleNumber(int[] nums) {
        Map<String,Integer> map=new HashMap<>();

        for (int num : nums) {

            if (!map.containsKey(num+"")){
                map.put(num+"",num);
            }
            else {
                map.remove(num+"");
            }

        }
        return map.entrySet().iterator().next().getValue();
    }
}
