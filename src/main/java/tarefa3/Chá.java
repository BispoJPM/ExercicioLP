package tarefa3;
public class Chá {
    // https://github.com/BispoJPM/ExercicioLP/assets/142633184/b634f29b-9ea8-4d44-adb9-6c6e84775e50

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
        return("Eu colhi esse chá no período da: " + horario);
    }

}
