package Pack1;

public class Questão_5 {

    public static void main (String[]args){

        double nota1;
        double nota2;
        double peso1;
        double peso2;
        double media;
        String MEDIA;

        nota1 = 5.0;
        nota2 = 7.1;
        peso1 = 3.5;
        peso2 = 7.5;
        media = ((nota1*peso1)+(nota2*peso2)) / (peso1+peso2);

        MEDIA = "MÉDIA = ";

        System.out.println(MEDIA+String.format("%.5f",media));

    }

}
