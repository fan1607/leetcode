package concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class _1195_交替打印字符串 {

    class FizzBuzz {
        private int n;
        private AtomicInteger inc = new AtomicInteger(1);

        public FizzBuzz(int n) {
            this.n = n;
        }

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            int cur;
            while ((cur = inc.get()) <= n) {
                if (cur % 3 == 0) {
                    if (cur % 15 == 0)
                        continue;
                    printFizz.run();
                    inc.incrementAndGet();
                }
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            int cur;
            while ((cur = inc.get()) <= n) {
                if (cur % 5 == 0) {
                    if (cur % 15 == 0)
                        continue;
                    printBuzz.run();
                    inc.incrementAndGet();
                }
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            int cur;
            while ((cur = inc.get()) <= n) {
                if (cur % 15 == 0) {
                    printFizzBuzz.run();
                    inc.incrementAndGet();
                }
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            int cur;
            while ((cur = inc.get()) <= n) {
                if (cur % 3 != 0 && cur % 5 != 0) {
                    printNumber.accept(cur);
                    inc.incrementAndGet();
                }
            }
        }
    }

    _1195_交替打印字符串(int n) throws InterruptedException {
        FizzBuzz fizzBuzz = new FizzBuzz(n);
        new Thread(() -> {
            try {
                fizzBuzz.fizz(new PrintFizz());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                fizzBuzz.buzz(new PrintBuzz());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(new PrintFizzBuzz());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                fizzBuzz.number(new PrintNumber());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        while (fizzBuzz.inc.get() <= n)
            Thread.sleep(100);
        System.out.println();
    }

    private class PrintFizz implements Runnable {
        @Override
        public void run() {
            System.out.print(" fizz");
        }
    }

    private class PrintBuzz implements Runnable {
        @Override
        public void run() {
            System.out.print(" buzz");
        }
    }

    private class PrintFizzBuzz implements Runnable {
        @Override
        public void run() {
            System.out.print(" fizzbuzz");
        }
    }

    private class PrintNumber implements IntConsumer, Runnable {
        int num = 0;

        @Override
        public void accept(int value) {
            num = value;
            run();
        }

        @Override
        public void run() {
            System.out.print(" " + num);
        }
    }
}
