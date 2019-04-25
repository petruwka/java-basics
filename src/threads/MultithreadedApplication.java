package threads;

public class MultithreadedApplication {

    static class State {
        private int i = 0;

        public void increment() {
            int old = i;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = old + 1;
            Thread thread = Thread.currentThread();
            String name = thread.getName();
            System.out.println(name + ": i = " + i);

        }

        public void increment(int times) {
            for (int i = 0; i < times; i++) {
                increment();
            }
            System.out.println("increment " + times + " times");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        State state = new State();
        state.increment(10);
        state.increment(10);

        Thread t1 = new Thread(() -> state.increment(1000), "thread1");
        Thread t2 = new Thread(() -> state.increment(1000), "thread2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // t1, t2
        // s1, s2

        System.out.println("#### check: " + state.i);

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("daemon thread");
        });
        t3.setDaemon(true);
        t3.start();
    }

    public static void testThreads() throws InterruptedException {
        // Thread

        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("after thread");
        System.out.println("something else");

        // wait for the result of the thread
        t1.join();

        System.out.println("guaranteed after thread finish");


        // Runnable
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

        System.out.println("after 2nd thread");

        Thread t3 = new Thread(() -> System.out.println("thread 3"));
        t3.start();
        ;
        System.out.println("after 3rd thread");


    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("running in my thread");
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("running from runnable");
        }
    }

}
