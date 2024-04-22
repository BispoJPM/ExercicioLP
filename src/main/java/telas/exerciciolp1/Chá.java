package telas.exerciciolp1;

public class Chá {

    private String nome;
    private int temperatura;
    private String cheiro;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public void setCheiro(String cheiro) {
        this.cheiro = cheiro;
    }
    public String getNome() {
        return nome;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public String getCheiro() {
        return cheiro;
    }
    public String tomar(int chas){
        return("\n" + "Eu tomei " + chas + " chás");
    }
    public void fazer(String como){
        System.out.print("Este chá foi feito por meio de " + como);
    }
    public String colher(String horario){
        return("Eu colhi esse chá no período da " + horario);
    }

}