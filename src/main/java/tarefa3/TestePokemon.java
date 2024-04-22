package tarefa3;
public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        // Definindo as propriedades do Pokémon
        pokemon.setTipo("Elétrico");
        pokemon.setTamanho(0.5);
        pokemon.setNível(20);

        // Exibindo informações sobre o Pokémon
        System.out.println("Tipo: " + pokemon.getTipo());
        System.out.println("Tamanho: " + pokemon.getTamanho() + "m");
        System.out.println("Nível: " + pokemon.getNível());

        // Realizando ações com o Pokémon
        System.out.println(pokemon.capturei(3));
        pokemon.avaliar(5);
        System.out.println("Posso transferir? " + pokemon.transferir(6));
    }
}
