package tarefa3;
public class TestePessoas {
    public static void main(String[] args) {
        Pessoas pessoa = new Pessoas();

        // Definindo as propriedades da pessoa
        pessoa.setNome("João");
        pessoa.setAltura(1.75);
        pessoa.setCabelo("Preto");

        // Exibindo informações sobre a pessoa
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura() + "m");
        System.out.println("Cor do cabelo: " + pessoa.getCabelo());

        // Realizando ações com a pessoa
        System.out.println(pessoa.andar(500));
        System.out.println(pessoa.aguar(2));
        pessoa.pagar(20);
    }
}
