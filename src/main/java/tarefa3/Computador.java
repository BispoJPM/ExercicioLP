package tarefa3;
public class Computador {

    // https://github.com/BispoJPM/LP1/assets/142633184/9057e1a0-75a9-4b62-97cd-cd745d947c80

    private String marca;
    private int memoria;
    private int monitores;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public void setMonitores(int monitores) {
        this.monitores = monitores;
    }
    public String getMarca() {
        return marca;
    }
    public int getMemoria() {
        return memoria;
    }
    public int getMonitores() {
        return monitores;
    }
    public String jogar(double horas){
        return("\n" + "Eu passei " + horas + "horas jogando");
    }
    public String ligar(int velocidade){
        return("De 0 a 10, o pc liga quão rapido? 0 - muito lento / 10 - muito rapido: " + velocidade);
    }
    public void navegar(String lentidao){
        System.out.println("\n" + "O PC ele é: " + lentidao);
    }

    
}
