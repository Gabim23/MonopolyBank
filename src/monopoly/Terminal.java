
package monopoly;

import java.util.Scanner;

/**
 *
 * @author gabig
 */
public class Terminal {
    
    private Scanner scanner;

    public Terminal(){
        this.scanner = new Scanner(System.in);
    }

    public String read(){
        return scanner.nextLine();
    }

    public void show(String message){
        System.out.println(message);
 
    }
    
}
