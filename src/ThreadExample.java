import java.util.*;
public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread 1");
    }
    public static void main(String[] args) {

        ThreadExample t = new ThreadExample();
        t.start();
    }
}

