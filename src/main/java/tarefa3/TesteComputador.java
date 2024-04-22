package tarefa3;
public class TesteComputador {
    public static void main(String[] args) {
        Computador pc = new Computador();

        // Definindo as propriedades do computador
        pc.setMarca("Dell");
        pc.setMemoria(8);
        pc.setMonitores(1);

        // Exibindo informações sobre o computador
        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Memória: " + pc.getMemoria() + "GB");
        System.out.println("Monitores: " + pc.getMonitores());

        // Realizando ações com o computador
        System.out.println(pc.jogar(2.5));
        System.out.println(pc.ligar(8));
        pc.navegar("rápido");
    }
}
