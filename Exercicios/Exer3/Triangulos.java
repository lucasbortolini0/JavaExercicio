public class Triangulos{
    public static void main (String[] args){
        
        Integer numero = Integer.valueOf(args[0]);
        String letra = String.valueOf(args[1]);

    
    switch(letra){
        case "a":
            TriA triA = new TriA(numero);
                break;
        case "b":
            TriB triB = new TriB(numero);
                break;  
        case "c":
            TriC triC = new TriC(numero);
                break;  
        
        default:
            System.out.println("Erro");
        }	
    }
}
