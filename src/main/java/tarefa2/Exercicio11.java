package tarefa2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner voto = new Scanner(System.in);

        int anon;
        int anoa;

        System.out.print("Digite o ano de seu nascimento: ");
        anon = voto.nextInt();
        System.out.print("Digite o ano atual: ");
        anoa = voto.nextInt();

        int adulto = anoa - anon;

        if(adulto>=16){
            System.out.println("Você pode votar!");
        }else{
            System.out.println("Você não pode votar!");
        }    
    }
}

    

