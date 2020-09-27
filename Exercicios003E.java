// AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

//Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se ele é par ou ímpar (use o operador % para obter o resto de uma divisão inteira).

public class Exercicios003E {
    public static void main(String[] args) {
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
            if( n1 % 2 == 0){
            JOptionPane.showMessageDialog(null, "O numero é PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "Seu numero é IMPAR");
            }
        }
        
    }

