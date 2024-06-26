package tarefa2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner horas = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = horas.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = horas.nextDouble();

        final int horasSemanais = 40;
        final int semanasPorMes = 4;

        double salarioBase = horasTrabalhadas * salarioPorHora;

        if (horasTrabalhadas > horasSemanais * semanasPorMes) {
            int horasExtras = horasTrabalhadas - (horasSemanais * semanasPorMes);
            double valorHoraExtra = salarioPorHora * 1.5;
            double salarioTotal = salarioBase + (horasExtras * valorHoraExtra);
            
            System.out.println("O salário total do funcionário é: " + salarioTotal);
            
        } else {

            System.out.println("O salário total do funcionário é: " + salarioBase);
        }
    }
}
