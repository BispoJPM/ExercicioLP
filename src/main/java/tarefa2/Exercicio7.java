package tarefa2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int v1;

        System.out.print("Digite um valor: ");
        v1 = valor.nextInt();

        if (v1 > 10)
        System.out.print(v1 + " é maior que 10!");
        else if (v1 == 10)
        System.out.print(v1 + " é igual a 10");
        else
        System.out.print(v1 + " é menor que 10!");
    }
}
