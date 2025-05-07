package esercizio3;

public class Articolo {
    private int nomeArticolo;
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int quantitaDisponibili;

    // costruttore

    public Articolo(int nomeArticolo, int codiceArticolo, String descrizioneArticolo, int prezzo, int quantitaDisponibili) {
        this.nomeArticolo = nomeArticolo;
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.quantitaDisponibili = quantitaDisponibili;
    }

    // stampa

}
