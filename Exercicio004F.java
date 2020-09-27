//AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

//Faça um programa que recebe três números reais e os exibe em ordem crescente.


public class Exercicio004F {
    public static void main(String[] args) {
        
      double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
      double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
      double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero"));
      
      if((n1 <= n2  ) && (n1 <= n3)){
      if (n2 <= n3){
      JOptionPane.showMessageDialog(null, "Ordem crescente" +n1+" - "+n2+" - "+n3 );
      } else{
          JOptionPane.showMessageDialog(null,"Ordem crescente" +n1+" - "+n3+" - "+n2);
          
      }
        
      }
      else if((n2 <= n1) && (n2 <= n3)){
        if (n1 <= n3){
            JOptionPane.showMessageDialog(null,"Ordem crescente" +n2+" - "+n1+" - "+n3);
        }else{
            JOptionPane.showMessageDialog(null,"Ordem crescente" +n2+" - " +n3+" - "+n1);
        }  
      }
      else if(n1 <= n3){
          JOptionPane.showMessageDialog(null,"Ordem crescente" +n3+" - "+n1+" - "+n2);
      }else{
          JOptionPane.showMessageDialog(null,"Ordem crescente" +n3+" - "+n2+" - "+n1);
                  
      }
    }
    
}
