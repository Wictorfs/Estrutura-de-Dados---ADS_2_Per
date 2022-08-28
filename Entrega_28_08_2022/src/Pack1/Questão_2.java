package Pack1;

public class Questão_2 {

    public static void main (String[]args) {

        double pi;
        double raio;
        double area;
        String resultado;

        pi = 3.14159;
        raio = 2;
        area = (raio*raio) * pi;
        resultado = "A=";

        System.out.println(resultado+String.format("%.4f", area));

    }

}
