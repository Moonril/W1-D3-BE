package esercizio2;

public class MainSIM {
    public static void main(String[] args) {
        SIM sim1 = new SIM("123456");

        sim1.setCredito(10);

        Chiamata[] chiamate = new Chiamata[5];

        chiamate[0] = new Chiamata(50, 456456);
        chiamate[1] = new Chiamata(55, 456456);
        chiamate[2] = new Chiamata(52, 456456);
        chiamate[3] = new Chiamata(10, 456456);
        chiamate[4] = new Chiamata(20, 456456);



        sim1.stampaSim();
    }
}
