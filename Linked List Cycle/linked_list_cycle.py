# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        fast=head
        slow=head
        if head==None:
            return False
            
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if fast is slow:
                return True
        
        return False