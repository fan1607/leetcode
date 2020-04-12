package concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _1226_哲学家进餐 {

    private Semaphore semaphore = new Semaphore(4);

    private volatile Lock[] forks = new Lock[]{
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock()
    };

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        semaphore.acquire();

        int leftForkNo = philosopher;
        int rightForkNo = (philosopher + 1) % 5;

        if (philosopher % 2 == 0) {
            forks[leftForkNo].lock();
            forks[rightForkNo].lock();
        } else {
            forks[rightForkNo].lock();
            forks[leftForkNo].lock();
        }

        pickLeftFork.run();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        putRightFork.run();

        forks[leftForkNo].unlock();
        forks[rightForkNo].unlock();

        semaphore.release();
    }

    public static void main(String[] args) {
        final _1226_哲学家进餐 test = new _1226_哲学家进餐();
        for (int i = 0; i < 5; i++) {
            final int philosopher = i;
            final Runnable run = new Run();
            new Thread(() -> {
                try {
                    test.wantsToEat(philosopher, run, run, run, run, run);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    static class Run implements Runnable {
        @Override
        public void run() {

        }
    }
}
