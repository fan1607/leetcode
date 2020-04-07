package alg;

public class _009_回文数 {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        char[] num = String.valueOf(x).toCharArray();
        int i = 0, j = num.length - 1;
        while (i < j) {
            if (num[i++] != num[j--])
                return false;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || x > 0 && x % 10 == 0)
            return false;
        int revertNum = 0;
        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10;
            x /= 10;
        }
        return x == revertNum || x == revertNum / 10;
    }


    public static void main(String[] args) {
        _009_回文数 test = new _009_回文数();
        System.out.println(test.isPalindrome2(0));
        System.out.println(test.isPalindrome2(10));
        System.out.println(test.isPalindrome2(11));
    }
}
