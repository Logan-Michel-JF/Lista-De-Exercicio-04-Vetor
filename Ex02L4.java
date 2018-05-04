import javax.swing.JOptionPane;

public class Ex02L4{

    public static void main(String[] args){
 
        String[] nomes = new String[10];
        nomes[0] = "joão";
        nomes[1] = "\nPedro";
        nomes[2] = "\nLucas";
        nomes[3] = "\nRenan";
        nomes[4] = "\nJosé";
        nomes[5] = "\nPatrick";
        nomes[6] = "\nHenrique";
        nomes[7] = "\nMaria";
        nomes[8] = "\nMario";
        nomes[9] = "\nMarcio";

        JOptionPane.showMessageDialog(null, 
        nomes[0] +
        nomes[1] +
        nomes[2] +
        nomes[3] +
        nomes[4] +
        nomes[5] +
        nomes[6] +
        nomes[7] +
        nomes[8] +
        nomes[9]
        );
    }
}