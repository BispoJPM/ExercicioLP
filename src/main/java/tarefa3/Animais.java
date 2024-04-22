package tarefa3;
public class Animais {

    // https://github.com/BispoJPM/ExercicioLP/assets/142633184/91a00a0c-8a9b-40cf-9879-d4d3cd0f10bb

        private int pernas;
        private String tipo;
        private String mobilidade;

        public void setPernas(int pernas) {
            this.pernas = pernas;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setMobilidade(String mobilidade) {
            this.mobilidade = mobilidade;
        }

        public int getPernas() {
            return pernas;
        }

        public String getTipo() {
            return tipo;
        }

        public String getMobilidade() {
            return mobilidade;
        }

        public String domar(int quantos){
            return("\n"+"Foram domados " + quantos + " animais"+"\n");
        }
    
        public String força(int tipo){
            return ("Esse animal tem a força de " + tipo + " humanos");
        }
       
        public boolean comer(int av){
            boolean af=true;
            if(av%2==0) af=false; // Se for o resto da divisao for 0, da pra comer
            return af;
        }
}
