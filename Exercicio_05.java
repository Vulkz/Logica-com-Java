import javax.swing.JOptionPane;

public class Exercicio_05
{
    public static void main(String args[])
    {
        int quantParcelas;
        double totCompras, valParcelas;

        totCompras = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da compra: ", "CAIXA", JOptionPane.INFORMATION_MESSAGE));
        quantParcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de parcelas: ", "CAIXA", JOptionPane.INFORMATION_MESSAGE));

        valParcelas = totCompras / quantParcelas;

        JOptionPane.showMessageDialog(null, "Compras: " + totCompras + "\nParcelas: " + quantParcelas + "\nValor das parcelas: " + valParcelas);
    }
}
