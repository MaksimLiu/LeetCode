# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        if head==None:
            return None
        
        prev=head
        
        while prev.next!=None:
            if prev.next.val==val:
                prev.next=prev.next.next
            else:
                prev=prev.next
        return head if head.val!=val else head.next