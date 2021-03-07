package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algeti pachetul: Bronze, Silver sau Gold  ");

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
    }
}
