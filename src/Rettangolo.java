public class Rettangolo {
    //variabili
    private int altezza;
    private int base;

    // metodi

    public int perimetro(){
        return (base + altezza)*2;
    }
    public int area(){
        return (base * altezza);
    }

    public void stampaRettangolo(){
        System.out.println(perimetro());
    }

    public void stampaArea(){
        System.out.println(area());
    }

    //costruttori

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }


    //getter and setter


    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
