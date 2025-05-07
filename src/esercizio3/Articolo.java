package esercizio3;

public class Articolo {
    private String nomeArticolo;
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int quantitaDisponibili;

    // costruttore

    public Articolo(String nomeArticolo, int codiceArticolo, String descrizioneArticolo, int prezzo, int quantitaDisponibili) {
        this.nomeArticolo = nomeArticolo;
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.quantitaDisponibili = quantitaDisponibili;
    }

    // stampa

    @Override
    public String toString() {
        return "Articolo{" +
                "nomeArticolo=" + nomeArticolo +
                ", codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", quantitaDisponibili=" + quantitaDisponibili +
                '}';
    }


    // get set

    public String getNomeArticolo() {
        return nomeArticolo;
    }

    public void setNomeArticolo(String nomeArticolo) {
        this.nomeArticolo = nomeArticolo;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantitaDisponibili() {
        return quantitaDisponibili;
    }

    public void setQuantitaDisponibili(int quantitaDisponibili) {
        this.quantitaDisponibili = quantitaDisponibili;
    }
}
