package tarefa2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner atvd = new Scanner(System.in);

        float a1;
        float a2;

        System.out.print("Digite a nota da atividade 1: ");
        a1 = atvd.nextFloat();
        System.out.print("Digite a nota da atividade 2: ");
        a2 = atvd.nextFloat();

        float media = (a1 + a2) / 2;

        if (media>=6) {
            System.out.print("Sua média foi de " + media + " Parabens, você foi aprovado!");
        }else{
            System.out.print("Sua média foi de " + media + " Tente novamente, você foi reprovado!");
        }
    }
}
