package com.erlon.trabalhofinal;

public class Alimento {

    public int id;
    public String nome;
    public float proteinas;
    public float carboidrato;
    public float calorias;
    public float sodio;
    public float vitaminas;

    public Alimento() {

    }

    public Alimento(String nome, float proteinas, float carboidrato, float calorias, float sodio, float vitaminas) {
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

    public float getProteinas() {
        return proteinas;
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public float getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(float carboidrato) {
        this.carboidrato = carboidrato;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    public float getSodio() {
        return sodio;
    }

    public void setSodio(float sodio) {
        this.sodio = sodio;
    }

    public float getVitaminas() {
        return vitaminas;
    }

    public void setVitaminas(float vitaminas) {
        this.vitaminas = vitaminas;
    }

//    public int valor(float proteinas,float carboidrato, float calorias, float sodio, float vitaminas, int id){
 //       if (proteinas != 0 ) {
  //          if (proteinas <= this.proteinas);
   //     }

    }


}
