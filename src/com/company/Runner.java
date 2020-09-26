package com.company;

public class Runner extends Thread {

    public Runner(String name) {
        super(name);
    }

    private int nextRunner;
    private int rId;

    public int getNextRunner() {
        return nextRunner;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public void setNextRunner(int nextRunner) {
        this.nextRunner = nextRunner;
    }

    public void run() {
        if (getrId() == 0) {
            if (getNextRunner() == 6) {
                System.out.println(this.getName() + " берет палочку ");
                System.out.println(this.getName() + " бежит к финишу ");
            } else {
                System.out.println(this.getName() + " берет палочку");
                System.out.println(this.getName() + " бежит к Runner " + getNextRunner());
            }

        } else {
            if (getNextRunner() != 4){
                System.out.println(this.getName() + " берет палочку");
                System.out.println(this.getName() + " бежит к Runner " + getNextRunner());
            } else {
                System.out.println(this.getName() + " бежит к Runner " + getNextRunner());
            }
        }

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
