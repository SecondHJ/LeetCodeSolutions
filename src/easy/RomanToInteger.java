package easy;

/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * 解决思路:
 * 依次相加，如果左边数比右边数小则相减
 *
 * Created by second on 2017/9/22.
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        String[] nums = s.split("");
        int number = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (toNumber(nums[i]) >= toNumber(nums[i + 1]))
                number += toNumber(nums[i]);
            if (toNumber(nums[i]) < toNumber(nums[i + 1]))
                number -= toNumber(nums[i]);
        }
        number += toNumber(nums[nums.length - 1]);
        return number;
    }

    private int toNumber(String romanNum){
        switch (romanNum){
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
        }
        return 0;
    }

}
