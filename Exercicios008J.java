
// AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

/*Faça um programa que recebe os coeficientes 𝑎, 𝑏 𝑒 𝑐 (𝑎 ≠ 0) de uma equação de segundo grau e exibe os valores das raízes, 
se forem reais, ou a mensagem "nao existem raizes reais", caso contrário.*/


public class Exercicios008J {
    public static void main(String[] args) {
       double alt, larg, maior_area = -9999, area;
    int maior_triangulo = 0;
    
    for(int i = 1; i <=3; i++){
        alt = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura do Triângulo "+i));
        larg = Double.parseDouble(JOptionPane.showInputDialog("Informe a Largura do Triângulo "+i));
        area = (larg * alt)/2;
            if (area > maior_area){
                maior_area = area;
                maior_triangulo = i;
            }
    }
    JOptionPane.showInternalMessageDialog(null,"O maior triângulo é o: "+ maior_triangulo +""
            + " \nA maior área é : " + maior_area);
    }
}
        
        
        
        
        
        
        
        
        
    
  

