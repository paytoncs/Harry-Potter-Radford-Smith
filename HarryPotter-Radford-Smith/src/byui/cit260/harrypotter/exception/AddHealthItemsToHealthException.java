/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.exception;

/**
 *
 * @author Radford
 */
public class AddHealthItemsToHealthException extends Exception{

    public AddHealthItemsToHealthException() {
    }

    public AddHealthItemsToHealthException(String string) {
        super(string);
    }

    public AddHealthItemsToHealthException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public AddHealthItemsToHealthException(Throwable thrwbl) {
        super(thrwbl);
    }

    public AddHealthItemsToHealthException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
