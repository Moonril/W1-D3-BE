package esercizio2;

public class Chiamata {
    private int durata;
    private int numeroChiamato;


    public Chiamata(int durata, int numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public void setNumeroChiamato(int numeroChiamato){
        this.numeroChiamato = numeroChiamato;
    }

    public void stampa(){
        System.out.println("durata:" + durata + ",numero chiamato: " + numeroChiamato);
    }
}
