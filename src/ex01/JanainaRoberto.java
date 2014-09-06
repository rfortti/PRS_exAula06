/*1. Crie uma classe chamada "Lampada.java". Essa classe deverá ter o atributo 
"status". Sempre que uma instância da classe for criada, o status da lâmpada será 
"Apagada". Você deverá implementar os métodos para acender e apagar a luz (a luz 
não poderá ser acesa se já estiver acesa e nem apagada se já estiver apagada). 
Deverá também implementar um método exibirStatus para informar se atualmente a 
lâmpada está acesa ou apagada. Depois que a luz for apagada 5 vezes, seu status 
deve ser alterado para "queimada". A partir do momento em que a luz estiver 
queimada ela não poderá mais ser acesa. (OBS: Você tem liberdade para criar 
outros atributos/métodos caso ache necessário).
*/
package ex01;

/**
 *
 * @author Aluno
 */
public class JanainaRoberto 
{
    public static void main(String[] args) 
    {
       Lampada lampada = new Lampada();
       
       lampada.Acender();
       lampada.exibirStatus();
       
       lampada.Apagar();
       lampada.exibirStatus();
       
       lampada.Acender();
       lampada.exibirStatus();
       
       lampada.Apagar();
       lampada.exibirStatus();
       
       lampada.Acender();
       lampada.exibirStatus();
       
       lampada.Apagar();
       lampada.exibirStatus();
       
       lampada.Acender();
       lampada.exibirStatus();
       
       lampada.Apagar();
       lampada.exibirStatus();
       
       lampada.Acender();
       lampada.exibirStatus();
       
       lampada.Apagar();
       lampada.exibirStatus();
       
       lampada.Acender();
       lampada.exibirStatus();
       
       lampada.Apagar();
       lampada.exibirStatus();
    }
}
