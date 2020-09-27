//AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

// Faça um programa que recebe dois números inteiros distintos e exibe o maior.


public class Exercicio001 {
    public static void main(String[] args){
        
        
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero: "));  
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
        
        if(n1 > n2){
            JOptionPane.showMessageDialog(null, " O primeiro Número é maior que o segundo");
        }
        else{
            JOptionPane.showMessageDialog(null, "O segundo Número é maior que o primeiro");
        }
    }   
}
