import javax.print.attribute.standard.NumberUp;
import javax.swing.JOptionPane;

public class Ex01L4{

    public static void main(String[] args){

        int[] numeros = new int[16];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;
        numeros[6] = 70;
        numeros[7] = 80;
        numeros[8] = 90;
        numeros[9] = 100;
        numeros[10] = 110;
        numeros[11] = 120;
        numeros[12] = 130;
        numeros[13] = 140;
        numeros[14] = 150;
        numeros[15] = 160;

        int soma = 
        numeros[0]+
        numeros[1]+
        numeros[2]+
        numeros[3]+
        numeros[4]+
        numeros[5]+
        numeros[6]+
        numeros[7]+
        numeros[8]+
        numeros[9]+
        numeros[10]+
        numeros[11]+
        numeros[12]+
        numeros[13]+
        numeros[15];
        System.out.println("Soma: " + soma);
    }
}