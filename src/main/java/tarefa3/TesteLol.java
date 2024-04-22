package tarefa3;
public class TesteLol {
    public static void main(String[] args) {
        Lol lol = new Lol();

        // Definindo as propriedades do jogo
        lol.setClasse("Terror");
        lol.setPosição("Meio");
        lol.setForça("Alta");

        // Exibindo informações sobre o jogo
        System.out.println("Classe: " + lol.getClasse());
        System.out.println("Posição: " + lol.getPosição());
        System.out.println("Força: " + lol.getForça());

        // Realizando ações no jogo
        System.out.println(lol.farmar(200));
        System.out.println(lol.morrer(3));
        System.out.println(lol.matei(10));
    }
}
