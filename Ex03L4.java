import javax.swing.JOptionPane;

public class Ex03L4{

    public static void main(String[] args){
 
        String [] produtos = new String[7];
        double [] preco = new double[7];
        
        produtos[0] = JOptionPane.showInputDialog(null, "\nProduto 1: ");
        produtos[1] = JOptionPane.showInputDialog(null, "\nProduto 2: ");
        produtos[2] = JOptionPane.showInputDialog(null, "\nProduto 3: ");
        produtos[3] = JOptionPane.showInputDialog(null, "\nProduto 4: ");
        produtos[4] = JOptionPane.showInputDialog(null, "\nProduto 5: ");
        produtos[5] = JOptionPane.showInputDialog(null, "\nProduto 6: ");
        produtos[6] = JOptionPane.showInputDialog(null, "\nProduto 7: ");

        preco [0] = Double.parseDouble(JOptionPane.showInputDialog(null, "\nPreço do Produto 1: "));
        preco [1] = Double.parseDouble(JOptionPane.showInputDialog(null, "\nPreço do Produto 2: "));
        preco [2] = Double.parseDouble(JOptionPane.showInputDialog(null, "\nPreço do Produto 3: "));
        preco [3] = Double.parseDouble(JOptionPane.showInputDialog(null, "\nPreço do Produto 4: "));
        preco [4] = Double.parseDouble(JOptionPane.showInputDialog(null, "\nPreço do Produto 5: "));
        preco [5] = Double.parseDouble(JOptionPane.showInputDialog(null, "\nPreço do Produto 6: "));
        preco [6] = Double.parseDouble(JOptionPane.showInputDialog(null, "\nPreço do Produto 7: "));

        JOptionPane.showMessageDialog(null, 
        "\n" + produtos[0] + 
        "\n" + produtos[1] + 
        "\n" + produtos[2] + 
        "\n" + produtos[3] + 
        "\n" + produtos[4] + 
        "\n" + produtos[5] + 
        "\n" + produtos[6] +

        "\n" + preco[0] +
        "\n" + preco[1] +
        "\n" + preco[2] +
        "\n" + preco[3] +
        "\n" + preco[4] +
        "\n" + preco[5] +
        "\n" + preco[6] );

    }
}