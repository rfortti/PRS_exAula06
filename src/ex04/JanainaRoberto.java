/*
4. Crie uma classe chamada "Equacao2grau.java". Essa classe deverá ter um método 
para receber as variáveis de uma equação de 2º grau e imprimir o resultado do 
cálculo sendo que: Δ > 0 (2 resultados); Δ = 0 (1 resultado); Δ < 0 (Impossível 
calcular usando números reais). 
Dica: Pesquise sobre a classe nativa java.Math
*/

package ex04;

/**
 *
 * @author Aluno
 */
public class JanainaRoberto 
{
    public static void main(String[] args) 
    {
       Equacao2Grau equacao = new Equacao2Grau(2,-2,-3);
       equacao.calcularDelta();
       equacao.calcularX();
    }
}
