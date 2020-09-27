// AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;

/*Faça um programa que recebe duas datas distintas e exibe a mais recente. Cada data deve ser fornecida como três valores inteiros, 
onde o primeiro representa o dia, o segundo o mês e o terceiro o ano. Dica: comece verificando pelo ano.*/


public class Exercicios009K {
    public static void main(String[] args){
    double aresta1, aresta2, aresta3;
        int triangulo;
        
       aresta1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Aresta 1: "));
       aresta2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Aresta 2: "));
       aresta3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Aresta 3: "));
       
       if (aresta1 <= aresta2+aresta3 && aresta2 <= aresta1+aresta3 && aresta3 <= aresta1+aresta2){
           triangulo = 1;
       }else{
           triangulo = 0;
       }
       
       if (triangulo == 0){
           JOptionPane.showMessageDialog(null, "Triângulo Inválido");
       }else if(aresta1 == aresta2 && aresta2 == aresta3){
               JOptionPane.showInternalMessageDialog(null, "Triângulo Equilátero ");
           }else if(aresta1 != aresta2 && aresta2 != aresta3){
               JOptionPane.showInternalMessageDialog(null, "Triângulo Escaleno ");
           }else{
               JOptionPane.showInternalMessageDialog(null, "Triângulo Isóceles ");
           }
    }
}   
    
          
