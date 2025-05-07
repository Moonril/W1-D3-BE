package esercizio3;

public class Cliente {
    private String nome;
    private String cognome;
    private int codiceCliente;
    private String email;
    private String dataIscrizione;

    //costruttore


    public Cliente(String nome, String cognome, int codiceCliente, String email, String dataIscrizione) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceCliente = codiceCliente;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }
}
