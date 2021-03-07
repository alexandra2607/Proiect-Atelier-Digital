package Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1 = new Pacient.Builder("Ion")
                .setZiua(1)
                .setSalon(4)
                .setSpital("Fundeni")
                .setDiagnostic("Alergie")
                .build();

        Pacient pacient2 = new Pacient.Builder("Vasile")
                .setSpital("Malaxa")
                .setZiua(2)
                .setDiagnostic("Covid")
                .setStare("stabil")
                .build();

        Pacient pacient3 = new Pacient.Builder("Maria")
                .setZiua(3)
                .setSpital("Fundeni")
                .setDiagnostic("Raceala")
                .build();

        List<Pacient> pacienti = new ArrayList<Pacient>();
        pacienti.add(pacient1);
        pacienti.add(pacient2);
        pacienti.add(pacient3);


        while (true){
            Scanner nume = new Scanner(System.in);
            String userName = nume.nextLine();

            for (int i = 0; i < pacienti.size(); i++){
                if (userName.toString().equals(pacienti.get(i).nume)) {
                    System.out.println("Numele pacientului: " + userName);
                    System.out.println("Datele pacientului: " + pacienti.get(i).toString());
                }
            }
        }


    }
}
