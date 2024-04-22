package tarefa3;
public class TestaFracao {
        public static void main(String[] args) {
            Fracao fracao1 = new Fracao(8, 2);
            Fracao fracao2 = new Fracao(9, 4);
    
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
    
