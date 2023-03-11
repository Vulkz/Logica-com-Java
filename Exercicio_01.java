import javax.swing.JOptionPane;
public class Exercicio_01 {
    public static void main(String args[]){
        String nome;
        int numNota=0;
        double nota=0, media=0;

        nome = JOptionPane.showInputDialog(null, "Nome do aluno: ", "Aluno", JOptionPane.INFORMATION_MESSAGE);

        while(numNota<3){
            nota = Double.parseDouble(JOptionPane.showInputDialog(null, (numNota+1)+"º Nota: ", "Nota", JOptionPane.INFORMATION_MESSAGE));
            media = media + nota;
            numNota++;
        }

        media = media / numNota;

        JOptionPane.showMessageDialog(null, nome + " ficou com: " + media, "Média", JOptionPane.INFORMATION_MESSAGE);
    }
}
