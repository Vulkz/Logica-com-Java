import javax.swing.JOptionPane;

public class Exercicio_02
{
    public static void main(String[] args)
    {
        int idade=0, idadeDias=0;

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: ", "Anos", JOptionPane.INFORMATION_MESSAGE));

        idadeDias = idade * 365;

        JOptionPane.showMessageDialog(null, "Você viveu " + idadeDias + " dias", "Dias", JOptionPane.INFORMATION_MESSAGE);
    }
}
