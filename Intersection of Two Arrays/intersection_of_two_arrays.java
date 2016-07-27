public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
           if (!map.containsKey(nums1[i])){
               map.put(nums1[i],1);
           }
        }

        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]))
            {
                temp.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }

        int[] result = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++)
        {
            result[i] = temp.get(i);
        }

        return result;
    }
}
