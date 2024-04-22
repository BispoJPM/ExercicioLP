package tarefa3;
public class TestaAnimais {
        public static void main(String[] args) {
            Animais animal = new Animais();
    
            // Definindo as propriedades do animal
            animal.setPernas(4);
            animal.setTipo("Cachorro");
            animal.setMobilidade("Anda e corre");
    
            // Exibindo informações sobre o animal
            System.out.println("Pernas: " + animal.getPernas());
            System.out.println("Tipo: " + animal.getTipo());
            System.out.println("Mobilidade: " + animal.getMobilidade());
    
            // Realizando ações com o animal
            System.out.println(animal.domar(2));
            System.out.println(animal.força(3));
            System.out.println("Posso comer? " + animal.comer(5));
        }
    }
