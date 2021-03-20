package alg.array;

public class _剑指Offer11_旋转数组的最小数字 {

//    public int minArray(int[] numbers) {
//        int idx = 0;
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i - 1] > numbers[i]) {
//                idx = i;
//                break;
//            }
//        }
//        return numbers[idx];
//    }

    /**
     * 考虑数组中的最后一个元素 xx：
     * 在最小值右侧的元素，它们的值一定都小于等于 xx；
     * 而在最小值左侧的元素，它们的值一定都大于等于 xx。
     * 因此，我们可以根据这一条性质，通过二分查找的方法找出最小值
     */
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        int pivot;
        while (low < high) {
            pivot = low + (high - low) / 2; // TODO 二分查找中枢点
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                --high; // TODO 由于重复元素的存在，我们并不能确定 numbers[pivot] 究竟在最小值的左侧还是右侧
            }
        }
        return numbers[low];
    }
}
