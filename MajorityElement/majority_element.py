class Solution(object):
    def majorityElement(self,nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        major = nums[0]
        count = 1
        for index in range(1, len(nums)):
            if count == 0:
                count += 1
                major = nums[index]
            elif major == nums[index]:
                count += 1
            else:
                count -= 1
        return major