package Pack1;

public class Questão_10 {

    public static void main (String[]args){

        int cod1;
        int cod2;
        int num1;
        int num2;
        double val1;
        double val2;
        double total;
        String valor;

        cod1 = 12;
        cod2 = 16;
        num1 = 1;
        num2 = 2;
        val1 = 5.30;
        val2 = 5.10;
        total = (num1*val1)+(num2*val2);
        valor = "Valor à pagar: R$ ";

        System.out.println(valor + String.format("%.2f",total));

    }

}
