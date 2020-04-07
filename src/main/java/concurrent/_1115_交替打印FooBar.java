package concurrent;

public class _1115_交替打印FooBar {

    private int n = 5;

    private volatile byte flag = 1;
    private final Object mutex = new Object();

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            synchronized (mutex) {
                if (flag == 2)
                    mutex.wait();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                flag = 2;
                mutex.notifyAll();
            }
        }

    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            synchronized (mutex) {
                if (flag == 1)
                    mutex.wait();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                flag = 1;
                mutex.notifyAll();
            }
        }
    }

    class FooBar {

        public void foo() {
            for (int i = 0; i < n; i++) {
                System.out.println("foo");
            }
        }

        public void bar() {
            for (int i = 0; i < n; i++) {
                System.out.println("bar");
            }
        }
    }
}
