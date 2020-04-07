package alg;

public class _013_罗马数字转整数 {

    public int romanToInt(String s) {
        int sum = 0, preSum = 0, pre = 0, cur;
        for (Character c : s.toCharArray()) {
            switch (c) {
                case 'I':
                    cur = 1;
                    break;
                case 'V':
                    cur = 5;
                    break;
                case 'X':
                    cur = 10;
                    break;
                case 'L':
                    cur = 50;
                    break;
                case 'C':
                    cur = 100;
                    break;
                case 'D':
                    cur = 500;
                    break;
                default:
                    cur = 1000;
            }
            if (pre > 0 && pre != cur) {
                if (pre < cur) {
                    sum += cur - preSum;
                    preSum = 0;
                } else {
                    sum += preSum;
                    preSum = cur;
                }
            } else {
                preSum += cur;
            }
            pre = cur;
        }
        sum += preSum;
        return sum;
    }

    public static void main(String[] args) {
        _013_罗马数字转整数 test = new _013_罗马数字转整数();
        System.out.println(test.romanToInt("I"));
        System.out.println(test.romanToInt("II"));
        System.out.println(test.romanToInt("IV"));
        System.out.println(test.romanToInt("V"));
        System.out.println(test.romanToInt("VI"));
        System.out.println(test.romanToInt("VIV"));
        System.out.println(test.romanToInt("IX"));
        System.out.println(test.romanToInt("LVIII"));
        System.out.println(test.romanToInt("MCMXCIV"));
        System.out.println(test.romanToInt("MCMXC"));
    }
}
