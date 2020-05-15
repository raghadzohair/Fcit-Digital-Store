/*
 * Raghad zohair ID: 1705628 seciton: DBR
 * Email: Ryahya0010@stu.edu.kau.sa
 * program 5: FcitDigitalStore
 */
package dbr_1705628_p5_.fcit._fcitdigitalstore;


import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Raghad
 */
public class Customer implements Comparable <Customer>{
    
    private String firstName;
    private String lastName; 
    private int ID = -999;
    private int age ;
    private int rewardPoints;
    private ArrayList<Transaction> tranList = new ArrayList();

    public Customer() {
    }

    public Customer(String firstName, String lastName, int ID,int age, int rewardPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.age = age;
        this.rewardPoints = rewardPoints;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
        

    public ArrayList<Transaction> getTranList() {
        Collections.sort(tranList);
        return tranList;
    }
    
    public void addTransaction(Transaction t, Item item) throws UnderAgeException{ // declear exception    
        if ( item instanceof Movie  || item instanceof Series) {
            if (this.age > 18) {
                this.tranList.add(t);
            }else
                throw new UnderAgeException("Exception: Sorry! Your are not allowed to watch this .\n");
        }
        else
            this.tranList.add(t);  
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public void addRewardPoints(int rewardPoints){
        this.rewardPoints += rewardPoints;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getfullName() {
        return this.firstName+" "+this.lastName;
    }

    public void setfullName(String firstName ,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String printTransaction(){
        if (tranList.isEmpty()) {
            return "NONE...";
        } 
        else{
            String s = "";
            for (Transaction t : tranList) {
                s += t.toString()+"\r\n";
            }
            return s;
        }
    }

    @Override
    public int compareTo(Customer c) {
        if(this.getID()>c.getID()){
            return 1;
        }
        else if(this.getID()<c.getID()){
            return -1;
        }
        else
            return 0;
    }

    public String toString() {
        String s = "";
        if (this.getID() != -999) {
            s = "Customer Name: " + this.getfullName() + "\r\nID: " + this.getID() + "\r\nAge: " + this.getAge()+
                    "\r\nReward Points: " + this.getRewardPoints()+"\r\n";
        } else {
            s += "\r\nNon Registered Customer";
        }
        return s;
    }
    
    
    
}
