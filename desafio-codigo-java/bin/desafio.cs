using System;

public class desafio
{
    public static void Main()
    {
        //Ler os valores de Entrada
        float valoresSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valoresSalario >= 0 && valoresSalario <= 1100)
        {
            //Atribuir a liquota de 5% mediante o salário
            valorImposto = 0.05F * valoresSalario;
                        
        }

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


        float saida = valoresSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));
    }

}