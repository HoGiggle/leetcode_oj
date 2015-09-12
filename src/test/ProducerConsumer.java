package test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by MrHu on 2015/8/21.
 */
class Node{
    int id;
    String conName;
    public Node(int id, String conName){
        this.id = id;
        this.conName = conName;
    }

    @Override
    public String toString() {
        return conName + "_" + id;
    }
}

class PCStack{
    int capacity = 10;
    Node []arr;
    int top = -1;
    public PCStack(int capacity){
        this.capacity = capacity;
        this.arr = new Node[this.capacity];
    }

    public PCStack(){
        this.arr = new Node[this.capacity];
    }

    public synchronized void push(Node node){
        while (top == (capacity  - 1)){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        arr[++top] = node;
    }

    public synchronized Node pop(){
        while (top == -1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        return arr[top--];
    }
}

class Producer implements Runnable{
    PCStack stack;

    Producer(PCStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            Node n = new Node(i, Thread.currentThread().getName());
            stack.push(n);
            System.out.println("Produce: " + n.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    PCStack stack;

    Consumer(PCStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
       while (stack.top != -1){
           Node n = stack.pop();
           System.out.println("Consume: " + n.toString());
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        PCStack pag = new PCStack(5);
        Producer p = new Producer(pag);
        Consumer c = new Consumer(pag);

//        new Thread(p, "Producer 1").start();
        new Thread(p, "Producer 2").start();
        new Thread(c).start();
        List<Object> list = Collections.synchronizedList(new ArrayList<Object>());
    }
}


