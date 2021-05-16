package ua.kliushenkov.hw6;

public class Phone {
    int weight;
    String number,model;

    public void receiveCall(){
        System.out.println("Звонит " + model);
    }

    public String getNumber(){
        return number;
    }

    Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){

    }
}
