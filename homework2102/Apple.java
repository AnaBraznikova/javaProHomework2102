package telran.homework2102;

public class Apple extends  Phone {


    public void setApple(String name) {
                    }


    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public void call() {
        //super.call();
        System.out.println("Phone " + getName() + " call to " + "+" + getRandomNumber());
    }

    @Override
    public void receiveCall() {
        //super.receiveCall();
        System.out.println("Phone " + getName() + " receive call from " + "+" + getRandomNumber());
    }

    @Override
    public java.lang.String toString() {
        return "Apple{" +
                "name='" + getName() + '\'' +
                '}';
    }
}

