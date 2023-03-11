import javax.swing.JOptionPane;

public class Exercicio_07
{
    public static void main(String args[])
    {

        double num1, num2, num3;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1º Numero: ", "Número", JOptionPane.INFORMATION_MESSAGE));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2º Numero: ", "Número", JOptionPane.INFORMATION_MESSAGE));
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "3º Numero: ", "Número", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(
                null, "Num: " + num1 + " Raiz: " + Math.sqrt(num1) + "\nNum: " + num2 + " Raiz: " + Math.sqrt(num2) + "\nNum: " + num3 + " Raiz: " + Math.sqrt(num3), "Resultado", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
