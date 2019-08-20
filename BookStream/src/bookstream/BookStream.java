/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author yingd
 */
public class BookStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<List<Book>> books = Arrays.asList(Arrays.asList(new Book("Windmills of the Gods", 7.0), new Book("Tell me your dreams", 9.0)),
                Arrays.asList(new Book("There is a hippy on the highway", 5.0), new Book("Easy come easy go", 5.0)));
        double d = books.stream().flatMap(bs -> bs.stream()).map(book -> book.getPrice()).sum();
        System.out.println(d);
    }

}

class Book {

    private double price;
    private String title;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Book(String title, double price) {
        this.price = price;
        this.title = title;
    }
}
