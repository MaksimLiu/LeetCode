class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums=sorted(set(nums))
        if len(nums)<=1:
            return nums[0]
        else:
            return nums[len(nums)-3]
