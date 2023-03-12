import javax.swing.JOptionPane;

public class Exercicio_03
{
    public static void main(String[] args)
    {
        String nome;

        nome = JOptionPane.showInputDialog(null, "Nome: ", "Nome", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hy "+ nome + "!", "Saudação", JOptionPane.INFORMATION_MESSAGE);
    }
}
