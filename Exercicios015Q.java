//AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;



/*Desenvolva um programa que, com base em duas notas de provas e três notas de trabalhos dadas pelo usuário, 
exibe uma mensagem indicando se o aluno foi aprovado, reprovado ou se fará o exame.
• 6 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 ≤ 10, 𝑎𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• 4 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 6, 𝑒𝑥𝑎𝑚𝑒
• 0 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 4, 𝑟𝑒𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• Considere que 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 =
𝑃𝑟𝑜𝑣𝑎𝑠+𝑇𝑟𝑎𝑏𝑎𝑙ℎ𝑜𝑠 */



public class Exercicios015Q {
    public static void main(String[] args) {
        
        double prova1, prova2, trabalho1, trabalho2, trabalho3, mediap, mediat, mediaf;
        prova1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova1: "));
        prova2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova2: "));
        trabalho1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do trabalho 1: "));
        trabalho2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do trabalho 2: "));
        trabalho3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do trabalho 3: "));
    
    mediap = (prova1 + prova2)/2;
    mediat = (trabalho1 + trabalho2 + trabalho3) / 3;
    
    mediaf = (mediap + mediat)/ 2;
    
    if(mediaf >= 6){
        JOptionPane.showMessageDialog(null, "Aprovado");
    }else if(mediaf >= 4 && mediaf < 6){
        JOptionPane.showMessageDialog(null, "Exame");
    }else{
        JOptionPane.showMessageDialog(null, "Reprovado");
    }
    }   
}
    
          

