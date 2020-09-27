// AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

/*Elabore um programa que lê as medidas de três cubos retangulares (base, altura e largura) e exibe a ordem que eles devem ser colocados em um caminhão, obedecendo ao critério de que cubos com maior área devem ser colocados primeiro. Observe o exemplo a seguir:
• Cubo 1 – Base: 2 / Altura: 4 / Comprimento: 5;
• Cubo 2 – Base: 4 / Altura: 4 / Comprimento: 4;
• Cubo 3 – Base: 2 / Altura: 1 / Comprimento: 2.
Ordem da colocação: cubo 2, cubo 1 e cubo 3.*/




public class Exercicios017R {
    public static void main(String[] args) {
        
        double b1, b2, b3, h1, h2, h3, l1, l2, l3, a1, a2, a3;
        b1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Base do Cubo 1 "));
        h1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura do Cubo 1 "));
        l1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a comprimento do Cubo 1 "));
        
        
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Base do Cubo 2 "));
        h2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura do Cubo 2 "));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a comprimento do Cubo 2 "));
        
        b3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Base do Cubo 3 "));
        h3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura do Cubo 3 "));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a comprimento do Cubo 3 "));
        
        a1 = b1 * h1 * l1;
        a2 = b2 * h2 * l2;
        a3 = b3 * h3 * l3;
        
        if(a1 > a2 && a1 > a3 && a2 > a3){
            JOptionPane.showMessageDialog(null, String.format
        ("A ordem de Carregamento é Cubo 1 %.2f Cubo 2 %.2f e cubo 3 %.2f", a1, a2, a3));  
        }else if(a1 > a2 && a1 > a3 && a2 < a3){
            JOptionPane.showMessageDialog(null, String.format
        ("A ordem de Carregamento é Cubo 1 %.2f Cubo 3 %.2f e cubo 2 %.2f", a1, a3, a2));
            
        }else if(a2 > a1 && a2 > a3 && a1 > a3){
            JOptionPane.showMessageDialog(null, String.format
        ("A ordem de Carregamento é Cubo 2 %.2f Cubo 1 %.2f e cubo 3 %.2f", a2, a1, a3));
        }else if(a2 > a1 && a2 > a3 && a1 < a3){
            JOptionPane.showMessageDialog(null, String.format
        ("A ordem de Carregamento é Cubo 2 %.2f Cubo 3 %.2f e cubo 1 %.2f", a2, a3, a1));
            
        }else if(a3 > a1 && a3 > a2 && a1 > a2){
            JOptionPane.showMessageDialog(null, String.format
        ("A ordem de Carregamento é Cubo 3 %.2f Cubo 1 %.2f e cubo 2 %.2f", a3, a1, a2));
        }else if(a3 > a1 && a3 > a2 && a2 > a1){
            JOptionPane.showMessageDialog(null, String.format
        ("A ordem de Carregamento é Cubo 3 %.2f Cubo 2 %.2f e cubo 1 %.2f", a3, a2, a1));
        }
    }
        
}
    

