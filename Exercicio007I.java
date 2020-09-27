// autor  LUCAS CAYRES
import javax.swing.JOptionPane;

/*Faça um programa que recebe o valor de três arestas e exibe uma mensagem indicando se podem formar um triângulo. 
Em caso afirmativo, indique se ele é equilátero, isósceles ou escaleno. Lembre-se: 
Para que um triângulo exista, a medida de qualquer um dos lados deve ser menor que a soma das medidas dos outros dois.*/

public class Exercicio007I {
    public static void main(String[] args) {
          String operador;
        double num1, num2, resultado;
        
        operador = JOptionPane.showInputDialog("Insira o Operador \n + - / *");
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor: "));
        
        if (operador.equals("+")){
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null,num1 + " + " + num2 +" = " +resultado);
        }else if(operador.equals("-")){
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null,num1 + " - " + num2 +" = " +resultado);
        }else if(operador.equals("*")){
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null,num1 + " * " + num2 +" = " +resultado);
        }else if(operador.equals("/")){
            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null,num1 + " / " + num2 +" = " +resultado);
        }else{
            JOptionPane.showMessageDialog(null, "Insira um operador válido");
        }
 
    }
}