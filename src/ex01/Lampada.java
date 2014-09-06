package ex01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Lampada 
{
    private String status;
    private int contAcesa; // variável que verifica quantas vezes a lâmpada foi acesa
        
    public Lampada() // metodo construtor
    {  
        this.status = "Apagada";
        this.contAcesa = 0;
    }
        
    public void Acender() // método que verifica o acendimento da lâmpada
    {
        if (this.status.equals("Acesa"))
        {
            System.out.println("Lâmpada já está Acesa!");
        }
        else
        {
            if (this.status.equals("Queimada"))
            {
                System.out.println("Lâmpada Queimada!");
            }
            else
            {
               this.status = "Acesa"; 
            }
        }
    }
    
    public void Apagar() // método que verifica o desligamento da lâmpada
    {
        if (this.status.equals("Apagada"))
        {
            System.out.println("Lâmpada já está Apagada!");
        }
        else
        {
            if (this.contAcesa < 5)
            {
                this.status = "Apagada";            
                this.contAcesa = this.contAcesa +1;
            }
            else  
            {
                this.status = "Queimada";
            }
        }
    }
    
    public void exibirStatus() // método que verifica o status da lâmpada (Acesa ou Apagada)
    {
        System.out.println("Lâmpada " + this.status);
    }
    
}
