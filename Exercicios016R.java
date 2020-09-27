// AUTOR LUCAS CAYRES
import javax.swing.JOptionPane;



/*Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é definido como segue:
• 20% do salário para os funcionários homens com mais de quinze anos de casa;
• 25% do salário para as funcionárias mulheres com mais de dez anos de casa;
• R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.
Elabore um programa que recebe o sexo, o tempo de casa e o salário de um funcionário e exibe o valor total
que o funcionário receberá no Natal (salário + bônus).*/




public class Exercicios016R {
    public static void main(String[] args) {
        
        String sexo;
        int tempoCasa;
        double salario, bonus;
        
        sexo = JOptionPane.showInputDialog("Informe o sexo do funcionário: m/f");
        tempoCasa = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de casa: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário atual"));
        
        if(sexo.equals("m") && tempoCasa > 15){
            bonus = salario * 0.2;
        }else if (sexo.equals("f") && tempoCasa > 10){
            bonus = salario * 0.25;
        }else{
            bonus = 200;
        }
        
        JOptionPane.showMessageDialog(null, "Este funcionário receberá \n Salário: "
                +salario +"\n Bonus  : " +bonus +"\n Total    : " +(salario+bonus));
    }
}

    
