package tarefa2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        float v1;
        float v2;

        System.out.print("Digite o primeiro valor: ");
        v1 = valores.nextFloat();
        System.out.print("Digite o segundo valor: ");
        v2 = valores.nextFloat();

        if(v1 == v2) {
            System.out.println("Os valores são iguais, escreva outros diferentes");
        } else if(v1 > v2) {
            System.out.print("O maior valor é: " + v1);
        } else {
            System.out.print("O maior valor é: " + v2);
        }
    }
}

