import javax.swing.JOptionPane;

public class Ex05L4{

    public static void main(String[] args){

        double pesos[] = new double[5];

        pesos [0] = Double.parseDouble(JOptionPane.showInputDialog( "Digite o 1 peso: "));
        pesos [1] = Double.parseDouble(JOptionPane.showInputDialog( "Digite o 2 peso: "));
        pesos [2] = Double.parseDouble(JOptionPane.showInputDialog( "Digite o 3 peso: "));
        pesos [3] = Double.parseDouble(JOptionPane.showInputDialog( "Digite o 4 peso: "));
        pesos [4] = Double.parseDouble(JOptionPane.showInputDialog( "Digite o 5 peso: "));

        double somaPesos = pesos[0] +
                    pesos[1] +
                    pesos[2] +
                    pesos[3] +
                    pesos[4];
        
        double media = somaPesos / pesos.length;

        JOptionPane.showMessageDialog(null, 
        "soma total é : " + somaPesos + "\nMedia é: " + media
        );

    }
}