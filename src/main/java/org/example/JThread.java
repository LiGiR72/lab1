package org.example;

public class JThread extends Thread {
    private int count;
    private final int countTarget;
    //ThreadCreate; ???
    public JThread(String name, int count, int countTarget) {
        super(name);
        this.count = count;
        this.countTarget = countTarget;
    }

    public int getCount() {
        return count;
    }

    public int getCountTarget() {
        return countTarget;
    }

    @Override
    public void run() {
        do {
            System.out.println(this.getName() + " " + count);
            count++;
        } while (count != countTarget + 1);
    }

}
