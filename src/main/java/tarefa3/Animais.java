package tarefa3;
public class Animais {

    // https://github.com/BispoJPM/LP1/assets/142633184/debdddcf-c87b-4a2d-9502-68202e479e27

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
