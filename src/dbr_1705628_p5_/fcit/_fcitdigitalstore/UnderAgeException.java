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
public class UnderAgeException extends Exception {

    public UnderAgeException(String errMsg){
        
    }

    @Override
    public String getMessage() {
        return "Exception: Sorry! Your are not allowed to watch this\r\n"; 
    }
    
    
    
    
}
