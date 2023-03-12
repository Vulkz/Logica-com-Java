import javax.swing.JOptionPane;

public class Exercicio_09 {
    public static void main(String[] args){
        int num;
        String result;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Número", JOptionPane.INFORMATION_MESSAGE));
        result = num % 2 == 0 ? "PAR." : "IMPAR.";

        JOptionPane.showMessageDialog(null, num + " é " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}
