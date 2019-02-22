package add_one;

import standard.StandardPrint;

public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }

        for(int i = digits.length - 1; i >= 0; i--){

            if ((digits[i] + 1) == 10) {
                digits[i] = 0;
            }
            else {
                digits[i]++;
                return digits;
            }

        }

        int[] plus = new int[digits.length + 1];
        System.arraycopy(digits,0, plus, 1 , digits.length);
        plus[0] = 1;
        return plus;
    }
}
