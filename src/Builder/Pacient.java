package Builder;

import java.util.List;

public class Pacient {
    public String nume;
    private int day;
    private String spital;
    private String sectie;
    private int salon;
    private String diagnostic;
    private String stare;

    private Pacient(Builder builder){
        this.nume = builder.nume;
        this.day = builder.day;
        this.spital = builder.spital;
        this.sectie = builder.sectie;
        this.salon = builder.salon;
        this.diagnostic = builder.diagnostic;
        this.stare = builder.stare;
    }

    public String getNume() {
        return nume;
    }

    public int getDay() {
        return day;
    }

    public String getSpital() {
        return spital;
    }

    public String getSectie() {
        return sectie;
    }

    public int getSalon() {
        return salon;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public String getStare() {
        return stare;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", day=" + day +
                ", spital='" + spital + '\'' +
                ", sectie='" + sectie + '\'' +
                ", salon=" + salon +
                ", diagnostic='" + diagnostic + '\'' +
                ", stare='" + stare + '\'' +
                '}';
    }

    public static class Builder {
        public String nume;
        private int day;
        private String spital;
        private String sectie;
        private int salon;
        private String diagnostic;
        private String stare;

        public Builder(String nume){
            this.nume = nume;
        }

        public Builder setZiua( int day) {
            this.day = day;
            return this;
        }
        public Builder setSpital( String spital) {
            this.spital = spital;
            return this;
        }
        public Builder setSecia( String sectie) {
            this.sectie = sectie;
            return this;
        }

        public Builder setSalon( int salon) {
            this.salon = salon;
            return this;
        }
        public Builder setDiagnostic(String diagnostic) {
            this.diagnostic = diagnostic;
            return this;
        }
        public Builder setStare(String stare) {
            this.stare = stare;
            return this;
        }

        public Pacient build() {
            Pacient pacient = new Pacient(this);
//            if (takeUser(pacient)){
//                pacient.toString();
//            }
            return  pacient;
        }

//        public boolean takeUser(Pacient pacient){
//
//        }
    }
}
