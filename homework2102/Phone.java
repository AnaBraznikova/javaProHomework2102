package telran.homework2102;

import java.util.Random;

public abstract class Phone {

    protected String name;

    public abstract String getName();


    public abstract void call();

    public abstract void receiveCall();


    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10000000, 99999999);
        return randomNumber;
    }

  }
