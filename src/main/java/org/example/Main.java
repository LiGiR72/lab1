package org.example;

public class Main {
    public static void main(String[] args) {
        // 10 and 15
        System.out.println("Hello world!");
        System.out.println("first thread started");
        JThread a = new JThread("first", 1, 5);
        JThread b = new JThread("second", 1, 10);
        a.start();
        b.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        JThread e = new JThread("third",5, 10);
        System.out.println(e.getPriority());
        System.out.println(b.getPriority());
        e.start();
        try{
           b.join();
           e.join();
        }catch (InterruptedException exception){
               System.out.println("Thread has been interrupted");
        }
        JThread g = new JThread("forth", b.getCount(),15);
        JThread f = new JThread("fifth", b.getCount(),20);
        g.start(); f.start();
        System.out.println(g.getPriority());
        System.out.println(f.getPriority());
    }

}