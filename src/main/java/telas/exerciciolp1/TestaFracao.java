package telas.exerciciolp1;

import java.util.Scanner;

public class TestaFracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador e o denominador da primeira fração separados por espaço:");
        int numerador1 = scanner.nextInt();
        int denominador1 = scanner.nextInt();
        Fracao fracao1 = new Fracao(numerador1, denominador1);

        System.out.println("Digite o numerador e o denominador da segunda fração separados por espaço:");
        int numerador2 = scanner.nextInt();
        int denominador2 = scanner.nextInt();
        Fracao fracao2 = new Fracao(numerador2, denominador2);

        System.out.println("Fração 1: " + fracao1);
        System.out.println("Fração 2: " + fracao2);

        Fracao soma = fracao1.somar(fracao2);
        Fracao subtracao = fracao1.subtrair(fracao2);
        Fracao multiplicacao = fracao1.multiplicar(fracao2);
        Fracao divisao = fracao1.dividir(fracao2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
