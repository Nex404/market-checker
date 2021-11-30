import java.util.Scanner;

public class ioHandler {
    Scanner keyboard = new Scanner(System.in);

    public String fromCurr(){
        
        
        System.out.println("Von welcher KryptoWhrung möchtest du den Preis wissen?");
        String fromCurr =keyboard.next();
        
        return fromCurr;
    }
    public String toCurr(){
        
        
        System.out.println("In welche (Krypto-)Währung möchtest du tauschen?");
        String toCurr =keyboard.next();
        
        return toCurr;
    }
    
}
