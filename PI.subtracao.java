package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
    
    public static void main(String[] args){
    Scanner t  = new Scanner(System.in);
    int numero1, numero2, subtracao;
    
    System.out.print("Digite um número: ");
    numero1 = t.nextInt();
    
    System.out.print("Digite um número para subtrair: ");
    numero2 = t.nextInt();
    
    subtracao = numero1 - numero2;
    
    System.out.print("O resultado é: " + subtracao);

}
}
