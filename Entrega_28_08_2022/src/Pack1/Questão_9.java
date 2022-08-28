package Pack1;

public class Questão_9 {

    public static void main (String[]args){

        String nome;
        double sal;
        double vendas;
        double comissao;
        double total;
        String TOTAL;

        nome =  "Pedro";
        sal = 500.00;
        vendas = 1230.30;
        comissao = vendas * 0.15;
        total = sal + comissao;
        TOTAL = "TOTAL = ";

        System.out.println(TOTAL + String.format("%.2f",total));

    }

}
