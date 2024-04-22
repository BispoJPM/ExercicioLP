package tarefa3;
public class TesteFlores {
    public static void main(String[] args) {
        Flores flores = new Flores();

        // Definindo as propriedades das flores
        flores.setEstação("Primavera");
        flores.setPetalas(20);
        flores.setNome("Rosa");

        // Exibindo informações sobre as flores
        System.out.println("Estação: " + flores.getEstação());
        System.out.println("Pétalas: " + flores.getPetalas());
        System.out.println("Nome: " + flores.getNome());

        // Realizando ações com as flores
        System.out.println(flores.cheirar(10));
        System.out.println(flores.regar(3));
        System.out.println("Posso molhar? " + flores.molhar(6));
    }
}
