import javax.swing.JOptionPane;

public class Exercicio_04
{
    public static void main(String[] args)
    {
        double grausCels, grausFahr;

        grausCels = Double.parseDouble(JOptionPane.showInputDialog(null, "Graus Celsius: ", "Temperatura", JOptionPane.INFORMATION_MESSAGE));
        grausFahr = (9 * grausCels + 160) / 5;

        JOptionPane.showMessageDialog(null, "Graus fahrenheit: " + grausFahr, "Temperatura", JOptionPane.INFORMATION_MESSAGE);
    }
}
