package com.neoteric;

public class VolatileSyncronized {
    private volatile boolean running = true;

    public synchronized void update() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException  {
        VolatileSyncronized vs = new VolatileSyncronized();
        new Thread(() -> {
            while (vs.running) {
            }
            System.out.println("Stopped");
        }).start();
        Thread.sleep(1000);
        vs.update();
    }
}
