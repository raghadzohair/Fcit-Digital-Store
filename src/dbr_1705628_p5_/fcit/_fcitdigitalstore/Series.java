/*
 * Raghad zohair ID: 1705628 seciton: DBR
 * Email: Ryahya0010@stu.edu.kau.sa
 * program 5: FcitDigitalStore
 */
package dbr_1705628_p5_.fcit._fcitdigitalstore;

/**
 *
 * @author Raghad
 */
public class Series extends Item implements Discountable{
    
    private int season;

    public Series(String name,double price, int season ) {
        super(name, price);
        this.season = season;
        super.setPrice(calculateDisPrice());
    }

    @Override
    public double calculateDisPrice() {
        if(this.season > 1)
            return this.getPrice()-(this.getPrice()*this.discountRate);
        else
            return this.getPrice();
    }
    
    public String toString() {
        return super.toString() + "Season: " + season;
    } 
    
    
    
}
