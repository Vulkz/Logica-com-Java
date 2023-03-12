import javax.swing.JOptionPane;

public class Exercicio_10 {
    public static void main(String[] args){
        String nome, sexo;

        nome = JOptionPane.showInputDialog("Nome: ");
        sexo = JOptionPane.showInputDialog("Sexo: ").toUpperCase();

        if(sexo.equals("M")){
            JOptionPane.showMessageDialog(null, "Sejá bem vindo Sr. " + nome);
        }else if(sexo.equals("F")){
            JOptionPane.showMessageDialog(null, "Sejá bem vinda Sra. " + nome);
        }else{
            JOptionPane.showMessageDialog(null, "Sexo Inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
