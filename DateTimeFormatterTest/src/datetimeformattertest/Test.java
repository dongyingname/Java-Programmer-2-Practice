/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimeformattertest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author yingd
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        Locale loc = new Locale("fr", "FR");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy", loc);
        System.out.println(df.format(d));
    }

}
