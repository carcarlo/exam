package it.intorbida.exam;

public class Esame {
    private String nome;
    private int CFU;
    private int voto;
    private int data;

    public Esame(String nome, int CFU) {
        if (CFU < 1 || CFU > 18) {
            throw new IllegalArgumentException("I CFU devono essere compresi tra 1 e 18.");
        }
        this.nome = nome;
        this.CFU = CFU;
    }

    public void esameSostenuto(int voto, int data) {
        if (voto < 0 || voto > 31) {
            throw new IllegalArgumentException("Il voto deve essere compreso tra 0 e 31.");
        }
        if (data <= 20200000) {
            throw new IllegalArgumentException("La data deve essere un intero maggiore di 20200000.");
        }
        this.voto = voto;
        this.data = data;
    }

    // Metodi getter e setter per gli attributi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCFU() {
        return CFU;
    }

    public void setCFU(int CFU) {
        this.CFU = CFU;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
