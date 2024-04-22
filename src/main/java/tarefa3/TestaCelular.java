package tarefa3;
public class TestaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular();

        // Definindo as propriedades do celular
        celular.setMarca("Samsung");
        celular.setCameras(3);
        celular.setCor("Preto");

        // Exibindo informações sobre o celular
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Câmeras: " + celular.getCameras());
        System.out.println("Cor: " + celular.getCor());

        // Realizando ações com o celular
        System.out.println(celular.possuir(2));
        celular.quebrei(1);
        System.out.println("Posso fotografar? " + celular.fotografar("sim"));
    }
}
