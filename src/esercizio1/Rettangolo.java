package esercizio1;

public class Rettangolo {
    //variabili
    private double altezza;
    private double base;

    // metodi

    public double perimetro(){
        return (base + altezza)*2;
    }
    public double area(){
        return (base * altezza);
    }


    //costruttori

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }


    //getter and setter


    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
