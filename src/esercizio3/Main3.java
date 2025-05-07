package esercizio3;

import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args) {
        Cliente c = new Cliente("giulia", "giulie", 23, "giulia@giu.com", LocalDate.of(2025, 5, 7));

        Articolo[] articoli = new Articolo[3];
        articoli[0] =new Articolo("sasso", 24, "un sasso rotondo", 25, 1);
        articoli[1] =new Articolo("bicchiere", 24, "un bicchiere rotondo", 25, 1);
        articoli[2] =new Articolo("sasso", 24, "un sasso rotondo", 25, 1);

        Carrello carrello = new Carrello(c, articoli);

    }
}
