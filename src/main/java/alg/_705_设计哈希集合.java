package alg;

public class _705_设计哈希集合 {

    /**
     * 使用BitSet思路实现比较简单（没考察到哈希表不知能不能过）
     * 其他思路：链表法、开放地址法（碰撞时往后遍历，直到找到的槽位为空，但是查询时需要往后遍历，O(1) -> O(logn)。）
     *      还需要考虑扩容问题，更加复杂
     */
    class MyHashSet {

        private long[] slots = new long[15626]; // 1000000 / 64 = 15625，数组最大索引：[length - 1]

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {

        }

        public void add(int key) {
            int idx = key >> 6;
            slots[idx] = slots[idx] | (1L << (key & 63)); // TODO 注意是对long型的值进行位移，而不是int型。。。卡了很久
        }

        public void remove(int key) {
            int idx = key >> 6;
            slots[idx] = slots[idx] & ~(1L << (key & 63));
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            int idx = key >> 6;
            return (slots[idx] & (1L << (key & 63))) != 0;
        }
    }

    public static void main(String[] args) {
        System.out.println((1 << 63) - 1);
        System.out.println((1L << 63) - 1);
        System.out.println(Long.MAX_VALUE);

        System.out.println(1000000 >> 6);
        System.out.println(1000000 & 63);
    }
}
