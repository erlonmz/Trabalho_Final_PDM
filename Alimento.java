package com.erlon.trabalhofinal;

public class Alimento {

    public int id;
    public String nome;
    public double proteinas;
    public double carboidrato;
    public double calorias;
    public double sodio;
    public double vitaminas;

    public Alimento() {

    }

    public Alimento(String nome, double proteinas, double carboidrato, double calorias, double sodio, double vitaminas) {
        this.nome = nome;
        this.proteinas = proteinas;
        this.carboidrato = carboidrato;
        this.calorias = calorias;
        this.sodio = sodio;
        this.vitaminas = vitaminas;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                ", nome='" + nome + '\'' +
                ", proteinas=" + proteinas +
                ", carboidrato=" + carboidrato +
                ", calorias=" + calorias +
                ", sodio=" + sodio +
                ", vitaminas=" + vitaminas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }

    public double getVitaminas() {
        return vitaminas;
    }

    public void setVitaminas(double vitaminas) {
        this.vitaminas = vitaminas;
    }


    }



