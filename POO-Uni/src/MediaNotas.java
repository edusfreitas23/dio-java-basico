import java.util.Scanner;

public class MediaNotas {
    public static void main (String[] args) {
    
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite N1:");
         double nota1 = sc.nextDouble();

     System.out.println("Digite N2:"); 
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) /2;

    System.out.println("Sua média é:" + media);

        sc.close();

    }
}