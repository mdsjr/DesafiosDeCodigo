import java.util.Scanner;

public class correcao {
    public static void main(String[] args) throws Exception {
        // Ler os valores de Entrada:
        Scanner leitorDeEntrada = new Scanner(System.in);
        float valorSalario = leitorDeEntrada.nextFloat();
        float valorBeneficios = leitorDeEntrada.nextFloat();
        
        // Fechar o scanner
        leitorDeEntrada.close();

        // Calcular o valor do imposto
        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribuir a alíquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario > 1100 && valorSalario <= 2500) {
            // Atribuir a alíquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
        } else if (valorSalario > 2500) {
            // Atribuir a alíquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
        }

        // Calcula e imprime a saída com 2 casas decimais
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("%.2f%n", saida);
    }
}