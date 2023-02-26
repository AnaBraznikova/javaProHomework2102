package telran.homework2102;

public class Xiaomi extends Phone {

    public void setXiaomi(String name) {

    }


    @Override
    public String getName() {
        return "Xiaomi";
    }

    @Override
    public void call() {
        // super.call();
        System.out.println("Phone " + getName() + " call to " + "+" + getRandomNumber());
    }

    @Override
    public void receiveCall() {
        System.out.println("Phone " + getName()
                + " receive call from " + "+" + getRandomNumber());
    }

    @Override
    public java.lang.String toString() {
        return "Xiaomi{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
