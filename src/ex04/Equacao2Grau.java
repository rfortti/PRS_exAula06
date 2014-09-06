/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex04;

/**
 *
 * @author Multas
 */
import java.util.Scanner;

public class Equacao2Grau // ax² + bx + c = 0
{
    private double valorA;
    private double valorB;
    private double valorC;
    private double delta;
    
    public Equacao2Grau(double a, double b, double c) // método construtor
    {
        this.valorA = a;
        this.valorB = b;
        this.valorC = c;
        
        System.out.println("Coeficientes:");
        System.out.println("a = " + valorA + " / b = " + valorB + " / c = " + valorC);
        System.out.println("");
    }
    
    public void calcularDelta() // método para calcular delta
    {
        if (this.valorA == 0)
        {
            System.out.println("Não é Equação de 2º Grau !");
            System.out.println("Valor do coeficiente [ a ] deve ser diferente de 0 !");
        }
        else
        {
            delta = (valorB * valorB) - (4 * (valorA) * (valorC));
            System.out.println("Delta = " + delta);
        }
    }
    
    public void calcularX() // método para calcular os valores de x
    {
        if(this.delta < 0)
        {
            //impossivel calcular
            System.out.println("A equação não possui raízes reais, pois valor de delta é Negativo!");
        }
        else
        {
            //calcula os valor de x'
            double x1 = ((- this.valorB) + Math.sqrt(delta)) / 2 * (valorA);
            System.out.println("O valor de x' = " + x1);
            
            //calcula os valor de x''
            double x2 = ((- this.valorB) - Math.sqrt(delta)) / 2 * (valorA);
            System.out.println("O valor de x'' = " + x2);
        }
    }
}
