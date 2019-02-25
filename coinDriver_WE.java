
/**
 * Write a description of class coinDriver_WE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class coinDriver_WE
{
    public static void main()
    {
        MonetaryCoin_WE quarter = new MonetaryCoin_WE(0.25);
        MonetaryCoin_WE dime =  new MonetaryCoin_WE(0.10);
        MonetaryCoin_WE nickel = new MonetaryCoin_WE(0.05);
        double value;
        
        value = quarter.getValue()+ dime.getValue()+ nickel.getValue();
        
        System.out.println(quarter);
        quarter.flip();
        System.out.println(quarter);
        quarter.flip();
        System.out.println(quarter);
    }
}
/*
 * Heads
Tails
Tails

 */