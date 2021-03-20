package interview;

import java.util.Arrays;

/**
 * <p>
 * 描述：在一个二维坐标系，只考虑整数坐标点，有无限大的整数递增序列，从原点开始，从0开始逐一递增，并且按蛇形分布，如下：
 * <p>
 * <p>
 * 20
 * 10  19
 * 9   11  18
 * 3   8   12  17
 * 2   4   7   13  16
 * 0   1   5   6   14  15
 * <p>
 * 目标：实现一个函数f(x)，给定一个数值x，返回x的坐标(a,b)，返回改数值对应的坐标，如：f(7)=(2,1)
 */
public class Main {

    public static void main(String[] args) {
        solution(0);
        solution(1);
        solution(7);
        solution(8);
        solution(12);
        solution(14);
        solution(15);
    }

    public static int[] solution(int val) {
        System.out.print(val + "=");
        int[] res = new int[2];
        int line = 1;
        int max = 0, min = 0, nextMin = 0;
        while (max < val) {
            nextMin += line++;
            min = max + 1;
            max = nextMin - 1;
        }
        int curLine = nextMin == 0 ? line : line - 1;
        if (curLine % 2 == 0) {
            res[0] = curLine - (val - min) - 1;
            res[1] = val - min;
        } else {
            res[0] = curLine - (max - val) - 1;
            res[1] = max - val;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
