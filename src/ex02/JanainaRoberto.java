/*
2. Crie uma classe chamada "ControleMesaBar.java". Essa classe auxiliará no 
processo de controle de mesas de um bar. Os requisitos do bar são:
a. Gravar o número da mesa
b. Cada produto que for solicitado pelo cliente deverá ter o seu valor adicionado 
à sua mesa (instância).
c. Calcular o Valor Total da mesa (com a opção de 10% do garçom e com a 
possibilidade de se informar o número de pessoas na mesa e ele retornar também o 
valor dividido / pessoa).
*/

package ex02;

/**
 *
 * @author Aluno
 */
public class JanainaRoberto 
{
    public static void main(String[] args) 
    { 
       ControleMesaBar controle = new ControleMesaBar(1);
        
        controle.somaPedido(5);
        controle.somaPedido(10);
        controle.somaPedido(15);
        controle.somaPedido(20);
        controle.somaPedido(25);
        
        controle.totalMesa();
    }
}
