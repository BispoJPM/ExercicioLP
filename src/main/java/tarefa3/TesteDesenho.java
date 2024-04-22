package tarefa3;
public class TesteDesenho {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();

        // Definindo as propriedades do desenho
        desenho.setNome("Dragon Ball Z");
        desenho.setHorario(19.30);
        desenho.setClasse(12);

        // Exibindo informações sobre o desenho
        System.out.println("Nome: " + desenho.getNome());
        System.out.println("Horário: " + desenho.getHorario() + "h");
        System.out.println("Classe: " + desenho.getClasse());

        // Realizando ações com o desenho
        System.out.println(desenho.ouvir(5));
        desenho.assistir("televisão");
        System.out.println(desenho.gostar("One Piece"));
    }
}
