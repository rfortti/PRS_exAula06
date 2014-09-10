/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex02;

/**
 *
 * @author Multas
 */
import java.util.Scanner;

public class ControleMesaBar 
{
    private int nmesa;
    
    private double valor;
    private double total;
    private int pessoas;
    
    public ControleMesaBar(int mesa) // método construtor
    {
        this.nmesa = mesa;
        this.valor = 0;
        //this.total = 0;
        //this.pessoas = 0;
    }
    
    public void somaPedido(double valProd) // método para somar os pedidos solicitados por cada mesa
    {
        //System.out.println("Informe o produto:");
        //System.out.println("Informe o valor do produto:");
        
        this.valor = this.valor + valProd;
    }
    
    public void totalMesa() // método para calcular a conta de cada mesa
    {               
        Scanner scang = new Scanner(System.in);
        System.out.println("Deseja acrescentar taxa do Garçom ? Informe S(sim) ou N(não):");
        String taxaGarcom = scang.nextLine();
        double taxaG;
        
        if (taxaGarcom.equalsIgnoreCase("S")) {
            //calcula 10% do garçom
            taxaG = 0.10;
        } else {
            //sem 10% do garçom
            taxaG = 0;
        }
        
        Scanner scanp = new Scanner(System.in);
        System.out.println("Informe o número de pessoas para dividir a conta:");
        this.pessoas = scanp.nextInt();
        
        if (this.pessoas == 0)
        {
            System.out.println("Número de pessoas não pode ser = 0 !");            
        }
        else if (this.pessoas > 0)
        {
            this.total = ((this.valor * taxaG) + this.valor) / pessoas;
            System.out.println("Valor total da mesa " + this.nmesa + " = R$ " + this.total + " por Pessoa !");
        }
    }
}
