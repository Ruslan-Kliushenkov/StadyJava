package ua.kliushenkov.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone();
        Phone phoneThree = new Phone();

        phoneOne.number = "+380981111111";
        phoneTwo.number = "+380982222222";
        phoneThree.number = "+380983333333";

        phoneOne.model = "iPhone";
        phoneTwo.model = "not iPhone";
        phoneThree.model = "modelThree";

        phoneOne.weight = 100;
        phoneTwo.weight = 200;
        phoneThree.weight = 300;

        System.out.println(phoneOne.model + " " + phoneOne.number + " " + " " + phoneOne.weight);
        System.out.println(phoneTwo.model + " " + phoneTwo.number + " " + " " + phoneTwo.weight);
        System.out.println(phoneThree.model + " " + phoneThree.number + " " + " " + phoneThree.weight);

        phoneOne.receiveCall();
        phoneOne.getNumber();

        phoneTwo.receiveCall();
        phoneTwo.getNumber();

        phoneThree.receiveCall();
        phoneThree.getNumber();
    }
}
