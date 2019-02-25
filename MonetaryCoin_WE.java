
/**
 * MonetaryCoin that is derived from the Coin class presented in Chapter 4.
 * Store a value in the monetary coin that represents its value and add a 
 * method that returns its value. Create a main driver class to instantiate 
 * and compute the sum of several MonetaryCoin objects. Show that a monetary 
 * coin inherits its parent's ability to be flipped. Draw a class diagram UML.
 *
 * William Ellsworth
 * 2/22/19
 */
public class MonetaryCoin_WE extends Coin
{
    private double coinValue;
    
    public MonetaryCoin_WE(double coinValue)
    {
        this.coinValue= coinValue;
    }
    
    public double getValue()
    {
        return coinValue;
    }
}