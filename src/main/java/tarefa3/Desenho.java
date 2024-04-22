package tarefa3;
public class Desenho {
    
    // https://github.com/BispoJPM/LP1/assets/142633184/dacb8858-381a-43a2-bfbe-ce032e72e797

    private String nome;
    private double horario;
    private int classe;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setHorario(double horario) {
        this.horario = horario;
    }
    public void setClasse(int classe) {
        this.classe = classe;
    }
    public String getNome() {
        return nome;
    }
    public double getHorario() {
        return horario;
    }
    public int getClasse() {
        return classe;
    }
    public String ouvir(int ouvi){
        return("Eu normalmente ouço meus desenhos no volume: " + ouvi);
    }
    public void assistir(String cls){
        System.out.println("Eu assisto meus desenhos no: " + cls);
    }
    public String gostar(String dsn){
        return("O desenho que eu mais gosto é: " + dsn);
    }
}
