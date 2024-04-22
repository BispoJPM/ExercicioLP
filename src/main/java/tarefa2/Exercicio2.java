package tarefa2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int eleitores;
        int vb;
        int vn;
        int vv;
        int pvb;
        int pvn;
        int pvv;

        Scanner votos = new Scanner(System.in);

        System.out.print("Digite a quantidade de votos em branco: ");
        vb = votos.nextInt();
        System.out.print("Digite a quantidade de votos nulos: ");
        vn = votos.nextInt();
        System.out.print("Digite a quantidade de votos valídos: ");
        vv = votos.nextInt();

        eleitores = vb + vn + vv;
        pvb = (vb * 100) / 100;
        pvn = (vn * 100) / 100;
        pvv = (vv * 100) / 100;

        System.out.print("O número total de eleitores foi de: " + eleitores + "\n");
        System.out.print("O percentual de votos em branco para eleitores foi de: " + pvb + "%" + "\n");
        System.out.print("O percentual de votos nulos para eleitores foi de: " + pvn + "%" + "\n");
        System.out.print("O percentual de votos valídos para eleitores foi de: " + pvv + "%" + "\n");





    }
}
