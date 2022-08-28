package Pack1;

public class Questão_11 {

    public static void main (String[]args){

        double raio;
        double pi;
        double vol;
        String volume;

        raio = 3;
        pi = 3.14155;
        vol = (4/3.0) * pi * (raio*raio*raio);
        volume = "VOLUME = ";

        System.out.println(volume + String.format("%.3f",vol));

    }

}
