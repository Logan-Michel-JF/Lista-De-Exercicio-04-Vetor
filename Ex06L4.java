import javax.swing.JOptionPane;

public class Ex06L4{

    public static void main(String[] args){

        int idade[] = new int[9];
        int maiorIdade = Integer.MIN_VALUE;


        idade [0] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [2] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [3] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [4] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [5] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [6] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [7] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
        idade [8] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));

        if (idade[0] > maiorIdade){
            maiorIdade = idade[0];
        }

        if (idade[1] > maiorIdade){
            maiorIdade = idade[1];
        }
        if (idade[2] > maiorIdade){
            maiorIdade = idade[2];
        }
        if (idade[3] > maiorIdade){
            maiorIdade = idade[3];
        }
        if (idade[4] > maiorIdade){
            maiorIdade = idade[4];
        }
        if (idade[5] > maiorIdade){
            maiorIdade = idade[5];
        }
        if (idade[6] > maiorIdade){
            maiorIdade = idade[6];
        }
        if (idade[7] > maiorIdade){
            maiorIdade = idade[7];
        }
        if (idade[8] > maiorIdade){
            maiorIdade = idade[8];
        }
        
        JOptionPane.showMessageDialog(null, 
        "A Maior Idade é: " + maiorIdade);

    }
}