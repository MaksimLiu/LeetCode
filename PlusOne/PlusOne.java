public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length - 1;
		while (length >= 0) {
			if (digits[length] == 9) {
				digits[length--] = 0;
			} else {
				digits[length]++;
				return digits;
			}
		}
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		return res;
    }
}

/**
 * 以下代码切勿模仿=_=
 * 一开始只想到全部转成int整数进行加1操作，结果被10位的case打了回来，换成long型被20位的case打了回来=_=
 * 于是想到用BigDecimal类来处理数值很大的整数又不失精度
 *  BigDecimal虽然带来了精度上的提升和大数值处理能力，但是在性能上较慢。对于以上代码而言，要频繁取出各位的数值，效率可想而知=_=
 *
 */

import java.math.BigDecimal;
public class Solution {
    public int[] plusOne(int[] digits) {
        BigDecimal sum = new BigDecimal(0.0);

        for (int i = 0, j = digits.length - 1; j >= 0; i++, j--) {

            BigDecimal pow = new BigDecimal(10).pow(i);

            BigDecimal multi = new BigDecimal(digits[j]);

            sum = sum.add(multi.multiply(pow));
        }

        sum = sum.add(new BigDecimal(1.0));

        int length = String.valueOf(sum).length();
        int[] newDigits = new int[length];

        for (int j = length - 1, k = 0; j >= 0; j--, k++) {

            BigDecimal pow = new BigDecimal(10).pow(k);

            BigDecimal divide = sum.divide(pow);

            BigDecimal remain = divide.remainder(new BigDecimal(10));

            newDigits[j] = Double.valueOf(remain.toBigInteger().toString()).intValue();

        }

        return newDigits;
    }
}


