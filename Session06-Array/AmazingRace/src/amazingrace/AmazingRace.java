package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

public class AmazingRace {

    public static void main(String[] args) {
        //register();
        registerWithTakeAway();
    }

    public static void registerWithTakeAway() {

        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4s|%4.1f|%4s|%4.1f|\n",
                                    "XXX", name, yob, weight, " ", run());
            }
        };

        Pet racer[] = new Pet[]{new Dog("NGÁO ĐÁ", 2021, 50.0),
            new Dog("BÊ-TÔ", 2012, 5.0),
            new Cat("TOM", 1950, 10.5, "><"),
            new Cat("KITTY", 1990, 5.0, "><"),
            new Hamster("JERRY", 1960, 0.5),
            new Hamster("NHẮT", 2021, 0.3),
            ufo
        };

        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }

    }

    public static void register() {

        Pet racer[] = new Pet[]{new Dog("NGÁO ĐÁ", 2021, 50.0),
            new Dog("BÊ-TÔ", 2012, 5.0),
            new Cat("TOM", 1950, 10.5, "><"),
            new Cat("KITTY", 1990, 5.0, "><"),
            new Hamster("JERRY", 1960, 0.5),
            new Hamster("NHẮT", 2021, 0.3)
        };

        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }
    }
}
