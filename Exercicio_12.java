import javax.swing.JOptionPane;

public class Exercicio_12 {
    public static void main(String[] args){
        String nome, sexo;
        double altura, imc=0;

        nome = JOptionPane.showInputDialog("Nome: ");
        sexo = JOptionPane.showInputDialog("Sexo: ").toUpperCase();
        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));

        if(sexo.equals("M")){
            imc = (72.7 * altura) - 58;
        }else if(sexo.equals("F")){
            imc = (62.1 * altura) - 44.7;
        }else{
            JOptionPane.showMessageDialog(null, "Sexo inválido.");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, nome + " seu peso ideal é: " + imc);

    }
}
