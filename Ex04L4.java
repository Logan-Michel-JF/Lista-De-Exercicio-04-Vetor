import javax.swing.JOptionPane;

public class Ex04L4{

    public static void main(String[] args){
 
        double notas[] = new double[4];
        double somaNota = 0;
        double media = 0;
        String nome = JOptionPane.showInputDialog("Digite o seu Nome: ");

        notas[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua Primeira Nota: "));
        notas[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua Segunda Nota: "));
        notas[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua Terceira Nota: "));
        notas[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua Quarta Nota: "));

        somaNota = notas[0] +
                   notas[1] +
                   notas[2] + 
                   notas[3];

        media = somaNota / notas.length;

        JOptionPane.showMessageDialog(null, 
        "Nome: " + nome + "\nMedia: " + media        
        );
    }
}