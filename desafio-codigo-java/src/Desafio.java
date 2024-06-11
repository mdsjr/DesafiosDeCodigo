//Para ler e escrever dados em Java, devemos padronizar da seguinte forma:
//- new Scanner(System.in) cria um leitor de Entradas, com métodos úteis com prefixo "mext";
// - System.out.pritln: .imprimir um texto de Saida (output) e pulando uma linha.

import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) throws Exception {
       //Ler os valores de Entrada:
       Scanner leitorDeEntrada = new Scanner(System.in);
       float valorSalario = leitorDeEntrada.nextFloat();
       float valorBeneficios = leitorDeEntrada.nextFloat();

       leitorDeEntrada.close();


       float valorImposto = 0;
       if (valorSalario >= 0 && valorSalario <= 1100) {
        //Atribuir a aliquota de 5% mediante o sálario:
        valorImposto = 0.05F * valorSalario;
       }
       else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
       } 
       else {valorImposto = 0.15F * valorSalario;
       }
       
       //Calcula e imprimir e saida com 2 casas decimais
       float saida = valorSalario - valorImposto + valorBeneficios;
       System.out.println(String.format("%2.f", saida));
    }
}
