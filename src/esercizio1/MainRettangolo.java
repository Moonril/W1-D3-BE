package esercizio1;

public class MainRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(3, 5);
        Rettangolo rettangolo2 = new Rettangolo(8, 5);


        stampaRettangolo(rettangolo1);
        stampaArea(rettangolo1);

        rettangolo1.area();
        stampaDueRettangoli(rettangolo1, rettangolo2);

    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.perimetro());
    }

    public static void stampaArea(Rettangolo rettangolo){
        System.out.println("l'area del rettangolo è: " + rettangolo.area());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);
        stampaArea(r1);
        System.out.println("Rettangolo 2:");
        stampaRettangolo(r2);
        stampaArea(r2);

        System.out.println("La somma dei perimetri: " + (r1.perimetro() + r2.perimetro()));
        System.out.println();
    }
}
