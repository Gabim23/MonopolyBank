
package monopoly;

import java.io.Serializable;

/**
 *
 * @author gabig
 */
public class Player implements Serializable {
    
    private Color color;
    private String name;
    private int balance;
    private boolean bankrupt;
    
    
    
    
    public int getBalance(){
        return this.balance;  
    }

    public boolean getBankrupt() {
        return this.bankrupt;
    }
    
    
            
    
}
