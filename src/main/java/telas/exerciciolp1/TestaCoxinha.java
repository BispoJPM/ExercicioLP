package telas.exerciciolp1;

public class TestaCoxinha {
    public static void main(String[] args) {
        Coxinha c1 = new Coxinha();

        c1.setReceita("Massa de batata");
        c1.setTamanho("Grande");
        c1.setRecheio("Carne");

        System.out.println("\n"+"Receita: " + c1.getReceita());
        System.out.println("Tamanho: " + c1.getTamanho());
        System.out.println("Recheio: " + c1.getRecheio());

        System.out.println(c1.comer(8));
        System.out.println(c1.armazenagem("Geladeira"));

        c1.assar("na airfreyer");
    }
}
