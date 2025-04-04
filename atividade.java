public class Main {

private int numero1;
private int numero2;

public Main(int numero1, int numero2) {
this.numero1 = numero1;
this.numero2 = numero2;
}

public int somar() {
    return this.numero1 + this.numero2;
}

public int subtrair() {
    return this.numero1 - this.numero2;
}

public int multiplicar() {
    return this.numero1 * this.numero2;
}

public static void main(String[] args) {

Main calculadora = new Main(5, 3);

int resultadoSoma = calculadora.somar();
System.out.println("A soma de " + calculadora.numero1 + " e " + calculadora.numero2 + " é: " + resultadoSoma);

int resultadoSubtracao = calculadora.subtrair();
System.out.println("A subtração de " + calculadora.numero1 + " e " + calculadora.numero2 + " é: " + resultadoSubtracao);

int resultadoMultiplicacao = calculadora.multiplicar();
System.out.println("A multiplicação de " + calculadora.numero1 + " e " + calculadora.numero2 + " é: " + resultadoMultiplicacao);

    }
}