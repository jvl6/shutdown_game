/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shutdown.model;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ZDK
 */
public class Random extends Thread {
    private int bound;
    private int random;

    public Random(int bound) {
        this.bound = bound;
    }

    public int getRandom() {
        this.run();
        return random;
    }
    
    @Override
    public void run(){
        this.random = ThreadLocalRandom.current().nextInt(0, this.bound);
    }
}
