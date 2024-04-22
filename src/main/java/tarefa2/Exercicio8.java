package tarefa2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        float valor1;

        System.out.print("Digite um valor: ");
        valor1 = valor.nextFloat();

        if (valor1 >= 0)
            System.out.println("Este número é positivo!");
        else
            System.out.println("Este número é negativo!");
    }
}
        

