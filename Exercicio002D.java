//AUTOR LUCAS CAYRES
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

//Faça um programa que recebe dois números reais e exibe o menor deles e com duas 

public class Exercicio002D {
    public static void main(String[] args){
       
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primero numero: "));  
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        
        if (n1<n2){
            DecimalFormat df = new DecimalFormat("##.##");
            JOptionPane.showMessageDialog(null,"O primeiro numero é menor que o segundo ="+ df.format (n1));
        }
        else{ 
            DecimalFormat df = new DecimalFormat("##.##");
            JOptionPane.showMessageDialog(null, "O segundo numero é menor que o primeiro =" + df.format (n2));
        }   
    }
}
