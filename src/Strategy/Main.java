package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algeti pachetul pentru a vizualiza serviciile: Bronze, Silver sau Gold  ");

        Scanner nume = new Scanner(System.in);
        String userChoice = nume.nextLine();


        System.out.println("Ati ales:" + userChoice);

        Party party = new Party();

        if (userChoice.equals("Bronze")){
            party.setFoodAndLocation(new BronzePackage());
        }
        else if (userChoice.equals("Silver")){
            party.setFoodAndLocation(new SilverPackage());
        }
        else if (userChoice.equals("Gold")){
            party.setFoodAndLocation(new GoldPackage());
        }


        party.getFoodAndLocation();
        party.plan();


        System.out.println("Scrieti suma pe care o alocati evenimentului: ");
        Scanner myInput = new Scanner( System.in );
        int suma = myInput.nextInt();

        if (suma >= 100 && suma < 1000){
            party.setFoodAndLocation(new BronzePackage());
            System.out.println("Va sugeram pachetul Bronze");
        }
        else if (suma >= 1000 && suma < 10000){
            party.setFoodAndLocation(new SilverPackage());
            System.out.println("Va sugeram pachetul Silver");
        }
        else if (suma >= 10000) {
            party.setFoodAndLocation(new GoldPackage());
            System.out.println("Va sugeram pachetul Gold");
        }

        party.getFoodAndLocation();
        party.plan();
    }
}
