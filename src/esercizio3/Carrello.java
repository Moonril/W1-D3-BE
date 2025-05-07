package esercizio3;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] articoli;
    private double totaleCarrello;


    //costruttore


    public Carrello(Cliente clienteAssociato, Articolo[] articoli) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = articoli;
        calcolaTotale();
    }

    //set get

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public double getTotaleCarrello() {
        return totaleCarrello;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
        calcolaTotale();
    }

    //metodo privato, si fanno privati quando non si vuole che vengano chiamati all'esterno
    private void calcolaTotale(){
        for (int i = 0; i < articoli.length; i++) {
            totaleCarrello += articoli[i].getPrezzo();
        }
    }

}
