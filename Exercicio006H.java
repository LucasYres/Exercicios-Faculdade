// AUTOR LUCAS CAYRES
import java.util.Scanner;
import javax.swing.JOptionPane;

/*Desenvolva um programa que recebe a base e a altura de três triângulos e exibe a maior área. Lembre-se da 
fórmula: 𝐴 = 𝑏𝑎𝑠𝑒 ×𝑎𝑙𝑡𝑢𝑟𝑎 / 2 */


public class Exercicio006H {
    public static void main(String[] args) {
        double num1, num2, num3;
       
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número Real: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número Real: "));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro número Real: "));
            
        
        if(num1 <= num2 && num1 <= num3 && num2 <= num3){
            JOptionPane.showMessageDialog(null,num1 +"\n" +num2 +"\n" +num3);
            System.exit(0);
        } else if(num1 <= num2 && num1 <= num3 && num3 <= num2){
            JOptionPane.showMessageDialog(null,num1 +"\n" +num3 +"\n" +num2);
            System.exit(0);
        }
        
      
        if(num2 <= num1 && num2 <= num3 && num1 <= num3){
            JOptionPane.showMessageDialog(null,num2 +"\n" +num1 +"\n" +num3);
            System.exit(0);
        }else if(num2 <= num1 && num2 <= num3 && num3 <= num1){
            JOptionPane.showMessageDialog(null,num2 +"\n" +num3 +"\n" +num1);
            System.exit(0);
        } 
        
        
        if(num3 <= num1 && num3 <= num2 && num1 <= num2){
            JOptionPane.showMessageDialog(null,num3 +"\n" +num1 +"\n" +num2);
            System.exit(0);
        } else if(num3 <= num2 && num3 <= num1 && num2 <= num1){
            JOptionPane.showMessageDialog(null,num3 +"\n" +num2 +"\n" +num1);
            System.exit(0);
        } 
    }
}