package tarefa2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner maca = new Scanner(System.in);

        int mc1;

        System.out.print("Digite a quantidade de maças compradas: ");
        mc1 = maca.nextInt();

        if (mc1 <= 6) {
            float mc2 = (mc1 * 1.30f);
            System.out.print("Custo total das maças foi de: R$ " + mc2);
        } else {
            float mc3 = (mc1 * 1);
            System.out.print("Custo total das maças foi de: R$ " + mc3);
        }
    }
}
