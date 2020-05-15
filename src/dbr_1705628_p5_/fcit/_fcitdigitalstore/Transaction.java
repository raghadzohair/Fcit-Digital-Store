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
public class Transaction implements Comparable < Transaction> {
    
    private int transactionId;
    private Customer customer;
    private Item item;
    private double cost;



    public Transaction(int transactionId, Item item, Customer customer) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.item = item;
        this.newPoint();
        cost = calculateCost();
    }

    public Transaction(int transactionId, Customer customer) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.newPoint();
        
    }
    
    public double calculateCost(){
        return this.item.getPrice();       
    }
    
    public void newPoint(){
        if (this.cost>100 && this.customer.getID() !=-999){            
            this.customer.addRewardPoints(10);
        }
    }
    
    @Override
    public int compareTo(Transaction t) {
        if(this.transactionId>t.transactionId){
            return 1;
        }
        else if(this.transactionId<t.transactionId){
            return -1;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return "transaction ID: " + transactionId + "\t Total Cost: " + cost;   //+"\r\nItem: " + this.item.getName();
    }
    
    
    
}
