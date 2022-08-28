package Pack1;

public class Questão_12 {

    public static void main (String[]args){

        double a;
        double b;
        double c;
        double pi;
        double a_tri;
        double a_cir;
        double a_tra;
        double a_qua;
        double a_ret;
        String tri;
        String cir;
        String tra;
        String qua;
        String ret;

        a = 3;
        b = 4;
        c = 5.2;
        pi = 3.14159;
        a_tri = (a*c) / 2;
        a_cir = (c*c) * pi;
        a_tra = ((a+b)*c) / 2;
        a_qua = b * b;
        a_ret = a * b;
        tri = "TRIÂNGULO: ";
        cir = "CÍRCULO: ";
        tra = "TRAPÉZIO: ";
        qua = "QUADRADO: ";
        ret = "RETÂNGULO: ";

        System.out.println(tri + String.format("%.3f ",a_tri));
        System.out.println(cir + String.format("%.3f",a_cir));
        System.out.println(tra + String.format("%.3f",a_tra));
        System.out.println(qua + String.format("%.3f",a_qua));
        System.out.println(ret + String.format("%.3f",a_ret));

    }

}
