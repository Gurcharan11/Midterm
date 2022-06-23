/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 *
 * @author srinivsi
 */
public class StausUser {

    
    public enum Status {ZERO, ONE, TWO, THREE};
    private Status code;


    public void statusDetail(Status code) {

        switch (getCode()) {
            case ZERO:
                System.out.println("REJECTED");
                break;
            case ONE:
                System.out.println("PENDING");
                break;
            case TWO:
                System.out.println("PROCESSING");
                break;
            case THREE:
                System.out.println("APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }

    /**
     * @return the code
     */
    public Status getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Status code) {
        this.code = code;
    }
    
    

}
