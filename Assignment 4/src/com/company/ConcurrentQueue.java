package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<T> {

    private Queue<T> queue;
    public Object objLock = new Object();
    public ConcurrentQueue(){
        queue = new LinkedList<>();
    }
    public void add(T data){
        synchronized (objLock){
            queue.add(data);
        }

    }

    public T remove(){
        synchronized (objLock){
            if (queue.size() > 0){
                return queue.remove();
            }
        }
        return null;
    }

    public boolean isEmpty(){
        synchronized (objLock){
            return queue.size() > 0;
        }
    }

    public T peek(){
        synchronized (objLock){
            return queue.peek();
        }

    }

}
