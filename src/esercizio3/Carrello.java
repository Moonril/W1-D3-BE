package esercizio3;

public class Carrello {
    private String clienteAssociato;
    private String[] elencoArticoli = new String[5];
    private int totaleCarrello;


    //costruttore


    public Carrello(String clienteAssociato, String[] elencoArticoli, int totaleCarrello) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.totaleCarrello = totaleCarrello;
    }

}
