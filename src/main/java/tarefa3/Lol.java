package tarefa3;
public class Lol {
    // https://github.com/BispoJPM/ExercicioLP/assets/142633184/1acbe854-d254-4c78-bb4d-bfece8ebd3c4

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
