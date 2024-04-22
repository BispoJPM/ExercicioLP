package tarefa2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);

        float salario;
        float percentual;

        System.out.print("Digite o salário atual: ");
        salario = sal.nextFloat();
        System.out.print("Digite o percentual do reajuste: ");
        percentual = sal.nextFloat();

        float ajuste = salario * (percentual / 100);
        
        System.out.print("Seu salário antes do reajuste era de: R$" + salario + "\n");
        System.out.print("Seu salário após o reajuste é de: R$" + (ajuste+salario));
    }
}
