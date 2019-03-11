public class Calculadora{
    public static void main (String[] args){    
        
        Integer n1 = Integer.valueOf(args[0]);
        Integer n2 = Integer.valueOf(args[1]);

    System.out.println("Soma ="+ (n1 + n2) );
    System.out.println("Subtrair = " + (n1 - n2));
    System.out.println(" Multipliacação =" + (n1 * n2));
    System.out.println("Divisao = " +((double)n1 / n2));
    System.out.println("Maior = " + Math.max(n1,n2));

    }
}