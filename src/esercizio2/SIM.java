package esercizio2;

public class SIM {
    //variabili
    private int numTelefono;
    private int credito;
    private int[] ultimeChiamate = new int[5];


    //metodi

    public void stampa() {
        System.out.println("Numero: " + numTelefono + ", credito: " + credito + ", ultime chiamate: " + ultimeChiamate);
    }

    // costruttore

    public SIM(int numTelefono, int credito, int[] ultimeChiamate) {
        this.numTelefono = numTelefono;
        this.credito = credito;
        this.ultimeChiamate = ultimeChiamate;
    }


    // getter e setter


}
