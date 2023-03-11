import javax.swing.JOptionPane;

public class Exercicio_06
{
    public static void main(String args[])
    {
        int meses;
        double inicial, juros, taxaAdm, valorTot;

        inicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: ", "Investimento inical", JOptionPane.INFORMATION_MESSAGE));
        meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses: ", "Tempo do investimento", JOptionPane.INFORMATION_MESSAGE));

        juros = (inicial * 0.15) * meses;
        taxaAdm = juros * 0.20;
        valorTot = inicial + (juros - taxaAdm);

        JOptionPane.showMessageDialog(null, "Valor Inicial: R$" + inicial + "\nTempo investido: " + meses + " mês \nValor final: R$" + valorTot, "Resultado", JOptionPane.INFORMATION_MESSAGE);


    }
}
