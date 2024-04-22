package tarefa2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner tempo = new Scanner(System.in);

        float Fahrenheit;
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = tempo.nextFloat();

        float Celsius = (Fahrenheit - 32) / (1.8f);

        System.out.printf("A temperatura em Celsius é: %.0f", Celsius);
        Celsius = tempo.nextFloat();
    }
}
