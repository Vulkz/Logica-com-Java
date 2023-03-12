import javax.swing.JOptionPane;

public class Exercicio_11 {
    public static void main(String[] args){
        int anoNasc, idade;

        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Anos de Nascimento: "));
        idade = 2023 - anoNasc;

        if(idade > 16) {
            JOptionPane.showMessageDialog(null, "Com " + idade + " anos você já pode vota.");
        }else{
            JOptionPane.showMessageDialog(null, "Você não pode votar com " + idade + "anos.");
        }
    }
}
