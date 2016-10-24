class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        l=[]

        for x in list(range(1,n+1)):
            if x % 3 == 0 and x % 5 != 0:
                l.append(str("Fizz"))
            elif x % 5 == 0 and x % 3 != 0:
                l.append(str("Buzz"))
            elif x % 3 == 0 and x % 5 == 0:
                l.append(str("FizzBuzz"))
            else:
                l.append(str(x))

        return l
