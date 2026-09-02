import java.util.Scanner ;

public class e1{

    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("digite o valor da primeira nota.");
        double nota1=scanner.nextDouble();

        System.out.println("digite o valor da segunda nota.");
        double nota2=scanner.nextDouble();

        double media = (nota1+nota2) / 2;

        System.out.println("A media final é:" + media);

        scanner.close();
    


    }
}