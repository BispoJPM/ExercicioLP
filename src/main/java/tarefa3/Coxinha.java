package tarefa3;
public class Coxinha {

    // Link: https://github.com/BispoJPM/ExercicioLP/assets/142633184/5f0f0249-1e6b-4c0f-84d8-653c3b0aa223

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


