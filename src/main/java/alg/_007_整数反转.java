package alg;

public class _007_整数反转 {

    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            if (x == Integer.MIN_VALUE)
                return 0;
            sb.append('-');
            x = -x;
        }
        while (x > 0) {
            sb.append(x % 10);
            x /= 10;
        }
        try {
            return Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverse2(int x) {
        byte flag = 1;
        int res = 0;
        if (x < 0) {
            if (x == Integer.MIN_VALUE)
                return 0;
            x = -x;
            flag = 0;
        }
        while (x >= 10) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (x > 0) {
            if (Integer.MAX_VALUE / 10 < res)
                return 0;
            res = res * 10 + x;
        }
        return flag == 1 ? res : -res;
    }

    public int reverse3(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}
