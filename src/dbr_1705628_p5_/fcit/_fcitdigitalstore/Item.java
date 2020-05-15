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
public abstract class Item {
    
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        return "Name: " + name + "\r\n Price: " + price+"\r\n" ;
    }  

}
