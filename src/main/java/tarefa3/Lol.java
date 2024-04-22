package tarefa3;
public class Lol {
    // https://github.com/BispoJPM/LP1/assets/142633184/69e08463-236b-429e-82d9-0b5820453b5c

    private String classe;
    private String posição;
    private String força;

    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setPosição(String posição) {
        this.posição = posição;
    }
    public void setForça(String força) {
        this.força = força;
    }
    public String getClasse() {
        return classe;
    }
    public String getPosição() {
        return posição;
    }
    public String getForça() {
        return força;
    }
    public String farmar(int farm){
        return("Eu farmei " + " minions na lane");
    }
    public String morrer(int morri){
        return("Eu morri " + " vezes nas TFs");
    }
    public String matei(int matar){
        return("Eu matei " + " noobs no jogo");
    }
}
