
import javax.swing.JOptionPane;
// AUTOR LUCAS CAYRES

public class Exercicios011M {
    public static void main(String[] args) {
     int dia1, mes1, ano1, dia2, mes2, ano2;
        
        dia1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro dia: "));
        mes1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro mês: "));
        ano1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro ano: "));
        
        dia2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo dia: "));
        mes2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo mês: "));
        ano2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo ano: "));
        
        if (ano1 > ano2){
            JOptionPane.showMessageDialog(null, "A data mais recente é " +dia1+"/"+mes1+"/"+ano1);
        }else if(ano1 == ano2 && mes1 > mes2){
            JOptionPane.showMessageDialog(null, "A data mais recente é " +dia1+"/"+mes1+"/"+ano1);
        }else if(ano1 == ano2 && mes1 == mes2 && dia1 > dia2){
            JOptionPane.showMessageDialog(null, "A data mais recente é " +dia1+"/"+mes1+"/"+ano1);
        }else if(ano1 == ano2 && mes1 == mes2 && dia1 == dia2){
            JOptionPane.showMessageDialog(null, "As duas datas são Iguais ");
        }else{
            JOptionPane.showMessageDialog(null, "A data mais recente é " +dia2+"/"+mes2+"/"+ano2);
        }
        
    }

}