package esercizio3;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cognome;
    private int codiceCliente;
    private String email;
    private LocalDate dataIscrizione;

    //costruttore


    public Cliente(String nome, String cognome, int codiceCliente, String email, LocalDate dataIscrizione) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceCliente = codiceCliente;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    //tos tring

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceCliente=" + codiceCliente +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }

    //get set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(LocalDate dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
}
