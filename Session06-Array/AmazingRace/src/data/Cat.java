
package data;

import java.util.Random;


public class Cat extends Pet {
    
    public static final double MAX_SPEED = 50;
    private String ribbon;//ruy băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        Random rd = new Random();
        double speed = rd.nextDouble() * MAX_SPEED;
        //         trong khoảng (0 .. 1) *50 = gần 50
        return speed;
    }

    @Override
    public void showRecord() {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%4s|%4.1f|\n",
                           name, yob, weight, ribbon, run());
    }

    
    
    
}
