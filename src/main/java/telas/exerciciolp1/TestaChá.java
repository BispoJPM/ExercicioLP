package telas.exerciciolp1;

public class TestaChá {
    public static void main(String[] args) {
        Chá chá = new Chá();

        // Definindo as propriedades do chá
        chá.setNome("Camomila");
        chá.setTemperatura(80);
        chá.setCheiro("Floral");

        // Exibindo informações sobre o chá
        System.out.println("\n"+"Nome: " + chá.getNome());
        System.out.println("Temperatura: " + chá.getTemperatura());
        System.out.println("Cheiro: " + chá.getCheiro());

        // Realizando ações com o chá
        System.out.println(chá.tomar(2));
        chá.fazer("indução" + "\n"); //indução, decocção ou maceração
        System.out.println(chá.colher("manhã") + "\n");
    }
}
