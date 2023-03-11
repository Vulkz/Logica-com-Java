import javax.swing.JOptionPane;

public class Exercicio_08
{
    public static void main(String args[])
    {
        int x, y, z;

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de X: ", "X Value", JOptionPane.INFORMATION_MESSAGE));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de Y: ", "Y Value", JOptionPane.INFORMATION_MESSAGE));

        z = x;
        x = y;
        y = z;

        JOptionPane.showMessageDialog(null, "X: " + x + "\nY: " + y, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
