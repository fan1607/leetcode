package alg;

public class _167_两数之和II {

    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1, sum;
        while (low < high) {
            sum = numbers[low] + numbers[high];
            if (sum == target)
                return new int[]{low + 1, high + 1};
            if (sum < target) low++;
            else high--;
        }
        throw new IllegalArgumentException("no solution");
    }
}
