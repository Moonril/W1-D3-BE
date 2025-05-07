package esercizio2;

public class SIM {
    //variabili
    private String numTelefono;
    private double credito;
    private int[] ultimeChiamate = new int[5];
    private Chiamata[] chiamata;




    // costruttore


    public SIM(String numTelefono) {
        this.numTelefono = numTelefono;
        this.credito = 0;
    }


    //metodi

    public void stampaSim(){
        System.out.println("Il numero è: " + numTelefono);
        System.out.println("Il credito è: " + credito);

        for (int i = 0; i < chiamata.length; i++) {
            chiamata[i].stampa();
        }
    }

    // getter e setter


    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public int[] getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void setUltimeChiamate(int[] ultimeChiamate) {
        this.ultimeChiamate = ultimeChiamate;
    }

    public Chiamata[] getChiamata() {
        return chiamata;
    }

    public void setChiamata(Chiamata[] chiamata) {
        this.chiamata = chiamata;
    }
}
