import java.util.Scanner;

public class JavaCompleto {
    
    // Método para soma de dois números inteiros
    public static int soma(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       int a, b;
       int resultado;
       
        System.out.println("Informe o Primeiro Valor: ");
        a = ler.nextInt();
        
        System.out.println("Informe o Segundo Valor: ");
        b = ler.nextInt();
        
        
        resultado = soma(a, b);
        
        System.out.println("O resultado é: " + resultado);
    }       
}