import javax.swing.JOptionPane;

public class Ex07L4{

    public static void main(String[] args){

        double altura[] = new double[4];
        double menorAltura = Double.MAX_VALUE;

        altura [0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Animal: "));
        altura [1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Animal: "));
        altura [2] = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Animal: "));
        altura [3] = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Animal: "));

        if (altura [0] < menorAltura){
            menorAltura = altura[0];
        }
        if (altura [1] < menorAltura){
            menorAltura = altura[1];
        }
        if (altura [2] < menorAltura){
            menorAltura = altura[2];
        }
        if (altura [3] < menorAltura){
            menorAltura = altura[3];
        }

        JOptionPane.showMessageDialog(null, 
        "O Animal com Menor Altura é: " + menorAltura
        );
    }
}