package telran.homework2102;

public class AppPhone {

    public static void main(String[] args) {


        Phone[] phones = {new Samsung(), new Xiaomi(), new Apple()};
        for(Phone sPhone :phones) {
            sPhone.call();
            sPhone.receiveCall();
            }


        }

    }



