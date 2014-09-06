/*
3. Crie uma classe chamada "Inverter.java". Essa classe deverá ter um método 
para receber uma String qualquer e imprimi-la invertida. 
Ex: Entrada: IFSP / Saída: PSFI
*/

package ex03;

/**
 *
 * @author Multas
 */
import java.util.Scanner;

public class Inverter 
{
    public static void main(String[] args) 
    {
        String palavra;
    
        String nome = "Roberto Forti"; 

        for (int a = nome.length() -1; a >= 0; a--)
        { 
            System.out.print(nome.charAt(a));
        }
        System.out.println("");
    }
}
