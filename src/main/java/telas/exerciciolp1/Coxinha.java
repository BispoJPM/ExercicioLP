package telas.exerciciolp1;

public class Coxinha {
    // Link: https://github.com/BispoJPM/LP1/assets/142633184/6cc82eeb-07a5-4114-9b41-9cd49aebed51

    private String receita;
    private String tamanho;
    private String recheio;

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getReceita() {
        return receita;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getRecheio() {
        return recheio;
    }

    public String comer(int quantas){
        return("\n"+"Comi " + quantas + " Coxinhas");
    }

    public String armazenagem(String tipo){
        return ("Armazenagem " + tipo);
    }

    public void assar(String como){
        System.out.println("Estou assando " + como +"\n");
    }
}
