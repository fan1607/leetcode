package concurrent;

import java.util.concurrent.CountDownLatch;

public class _1114_按序打印 {

    private CountDownLatch job2CD = new CountDownLatch(1);
    private CountDownLatch job3CD = new CountDownLatch(2);

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();

        job2CD.countDown();
        job3CD.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        job2CD.await();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();

        job3CD.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        job3CD.await();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    private static class Foo {
        public void one() {
            System.out.println("one");
        }

        public void two() {
            System.out.println("two");
        }

        public void three() {
            System.out.println("three");
        }
    }
}
