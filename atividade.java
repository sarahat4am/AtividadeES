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

    public double dividir() {
    
        if (this.numero2 != 0) {
            return (double) this.numero1 / this.numero2;
        } else {
            System.out.println("Erro: Não é possível dividir por zero.");
            return 0; // Retorna 0 em caso de erro
        }
    }

    public static void main(String[] args) {

        Main calculadora = new Main(5, 0); // Teste com divisor igual a 0 para verificar o erro

        int resultadoSoma = calculadora.somar();
        System.out.println("A soma de " + calculadora.numero1 + " e " + calculadora.numero2 + " é: " + resultadoSoma);

        int resultadoSubtracao = calculadora.subtrair();
        System.out.println("A subtração de " + calculadora.numero1 + " e " + calculadora.numero2 + " é: " + resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicar();
        System.out.println("A multiplicação de " + calculadora.numero1 + " e " + calculadora.numero2 + " é: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.dividir();
        if (resultadoDivisao != 0) {
            System.out.println("A divisão de " + calculadora.numero1 + " e " + calculadora.numero2 + " é: " + resultadoDivisao);
        }
    }
}
