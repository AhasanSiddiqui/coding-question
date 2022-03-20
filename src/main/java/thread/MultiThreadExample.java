package com.ahasan.arraysdemo.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadExample implements Runnable{
    BlockingQueue<Integer> queue ;

    public MultiThreadExample( BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        int count=0;
        while (queue.isEmpty()) {
            try {
                queue.put(count++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (!queue.isEmpty()) {
            queue.poll();
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        MultiThreadExample threadExample=new MultiThreadExample(queue);
        Thread thread=new Thread(threadExample);
        thread.start();
    }
}