package tarefa3;
public class Flores {
    // https://github.com/BispoJPM/ExercicioLP/assets/142633184/3b5a2f4a-5d1a-444b-a370-5546aa143524

    private String estação;
    private int petalas;
    private String nome;

    public void setEstação(String estação) {
        this.estação = estação;
    }
    public void setPetalas(int petalas) {
        this.petalas = petalas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEstação() {
        return estação;
    }
    public int getPetalas() {
        return petalas;
    }
    public String getNome() {
        return nome;
    }
    public String cheirar(int flores1){
        return("Hoje eu cheirei " + flores1 + "flores, no caminho para casa");
    }
    public String regar(int regar1){
        return("Eu reguei todos os meus " + regar1 + "vasos de flores hoje?");
    }
    public boolean molhar(int mlh){
        boolean mlhr = true;
        if(mlh%2==0) mlhr=false; // Se for 0, eu reguei, se não for, n"ao reguei
        return mlhr;
    }

}
