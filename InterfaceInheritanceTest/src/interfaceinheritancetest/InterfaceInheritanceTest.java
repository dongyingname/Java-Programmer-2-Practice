/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceinheritancetest;

/**
 *
 * @author yingd
 */
interface House {

    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office {

    public static String getAddress() {
        return "101 Smart Str";
    }
}

interface WFH extends House, Office {

    private boolean isOffice() {
        return true;
    }
}

class HomeOffice implements House, Office {

    public String getAddress() {
        return "R No 1, Home";
    }
}

public class InterfaceInheritanceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Office off = new HomeOffice();  //1     
//        System.out.println((off.getAddress()); //2
        
    }

}
