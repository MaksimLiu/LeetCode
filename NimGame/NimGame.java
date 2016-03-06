public class Solution {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}


/ **
* 	一种更高效的方法：https://leetcode.com/discuss/79805/o-1-efficient-single-line-java-using-bit-checking
*	
*	0b11是3的二进制表示。任何一个是4的倍数的整数，最低的两位必然为0。4的二进制表示是0b100。
*   当且仅当相同位的两个数都为1时，位与运算结果才为1。所以要使某个数与4的进行位与运算结果为0(0除外)，这个数的最低两位必须为1，其余位为0
*   事实上，x % 2^n == x & (2^n - 1)
*/

public class Solution {
    public boolean canWinNim(int n) {
         return (n & 0b11) != 0;
    }
}
