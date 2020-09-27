// AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

/*Faça um programa que recebe o nome e a data de nascimento de duas pessoas e exibe o nome da mais velha. 
Cada data deve ser fornecida em três valores inteiros, onde o primeiro representa o dia, o segundo o mês e o terceiro o ano.*/


public class Exercicios010L {
    public static void main(String[] args) {
    double a, b, c, delta, x1, x2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de a Dif 0: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de c: "));
    if (a != 0){
        delta = (b*b) - 4*a*c;
        x1 = (b*-1 + Math.sqrt(delta)) / (2*a);
        x2 = (b*-1 - Math.sqrt(delta)) / (2*a);
        JOptionPane.showInternalMessageDialog(null,String.format(" A raiz 1 é %.2f e a raiz 2 é %.2f ", x1, x2));
    }else{
        JOptionPane.showInternalMessageDialog(null, "A inválido");
    }    
  }
    
}