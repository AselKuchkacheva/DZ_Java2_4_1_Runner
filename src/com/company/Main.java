package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 5; i++) {
                Runner runner = new Runner("Runner " + i);
                runner.setNextRunner(i + 1);
                runner.setrId(0);
                runner.start();
                runner.join();

            }
            for (int i = 5; i > 1; i--) {
                Runner runner = new Runner("Runner " + i);
                runner.setNextRunner(i - 1);
                runner.setrId(1);
                runner.start();
                runner.join();
            }
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner 1 берет палочку ");
    }
}
