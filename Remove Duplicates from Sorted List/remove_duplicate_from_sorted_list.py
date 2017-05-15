# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None:
            return None
        
        prev=head
        
        while prev.next!=None:
            if prev.val==prev.next.val:
                prev.next=prev.next.next
            else:
                prev=prev.next
            
        return head
                