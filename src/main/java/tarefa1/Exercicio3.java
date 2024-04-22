package tarefa1;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){

        Scanner nota = new Scanner(System.in);

        float P1;
        float E1;
        float E2;
        float API;
        float SUB;
        float X;
        float LP1;
        float LPAPI;
        float LPSUB;
        float Teste;


        System.out.print("Digite a nota da prova: ");
        P1 = nota.nextFloat();
        System.out.print("Digite a nota da Atividade 1: ");
        E1 = nota.nextFloat();
        System.out.print("Digite a nota da Atividade 2: ");
        E2 = nota.nextFloat();
        System.out.println("Digite os pontos a mais X: ");
        X = nota.nextFloat();

        LP1 = (float) ((P1*0.6+((E1+E2)/2)*0.4)*0.5+X);
        System.out.println(LP1);
        Teste= (float) (Math.max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9));

        if(Teste == 0){
            System.out.print("Digite a nota da prova substitutiva: ");
            SUB = nota.nextFloat();
            LPSUB = (float)(LP1+(SUB*0.2));
            System.out.println("Sua média é:" + LPSUB);
        }else{
            System.out.print("Digite a nota da API: ");
            API = nota.nextFloat();
            LPAPI = (float)(LP1+(API*0.5));
            System.out.println("Sua média é " + LPAPI);
        }
    }
}
