package tarefa2;
import java.util.Scanner;

public class Exercicio1 {
        public static void main(String[] args){ 
            int idade;
            int meses;
            int dias;

            Scanner total = new Scanner(System.in);

            System.out.println("Digite sua idade em anos:" + "\n" + "Exemplo: 22 anos");
            idade = total.nextInt();
            System.out.println("Digite quantos meses você tem:" + "\n" + "Exemplo: 22 anos e '2' meses" );
            meses = total.nextInt();
            System.out.println("Digite sua idade em dias:" + "\n" + "Exemplo: 22 anos, 2 meses e '10' dias");
            dias = total.nextInt();

            int conta = (idade*365)+(meses*30)+dias;

            System.out.println("Sua idade em dias é:" + conta);
        } 
    }
