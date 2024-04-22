package telas.exerciciolp1;

public class Fracao {
    private int numerador;
    private int denominador;

    // Construtor
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
    }

    // Métodos getters e setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
    }


    private void simplificar() {
        int gcd = gcd(Math.abs(numerador), denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public Fracao somar(Fracao outra) {
        int novoDenominador = denominador * outra.denominador;
        int novoNumerador = (numerador * outra.denominador) + (outra.numerador * denominador);
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        resultado.simplificar();
        return resultado;
    }

    public Fracao subtrair(Fracao outra) {
        int novoDenominador = denominador * outra.denominador;
        int novoNumerador = (numerador * outra.denominador) - (outra.numerador * denominador);
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        resultado.simplificar();
        return resultado;
    }

    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = numerador * outra.numerador;
        int novoDenominador = denominador * outra.denominador;
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        resultado.simplificar();
        return resultado;
    }

    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        int novoNumerador = numerador * outra.denominador;
        int novoDenominador = denominador * outra.numerador;
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        resultado.simplificar();
        return resultado;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
