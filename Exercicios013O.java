// AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

/* Faça um programa que recebe a quantidade de cilindradas (cc) de um veículo de competição e exibe a categoria 
a qual ele pertence, sendo:
• De 0cc a 120cc: “Sub Production”;
• De 121cc a 240cc: “Production”;
• Acima de 240cc: “Super Production”. */




public class Exercicios013O {
    public static void main(String[] args) {
        int cilindrada;
        
        cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Escreva quantas cilindradas tem a moto: "));
        
        if (cilindrada > 0 && cilindrada <= 120){
            JOptionPane.showMessageDialog(null, "Sub Production");
        }else if (cilindrada > 120 && cilindrada <= 240){
            JOptionPane.showMessageDialog(null, "Production");
        }else if (cilindrada > 240){
            JOptionPane.showMessageDialog(null, "Super Production");
        }
    }
}
        
    

