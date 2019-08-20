/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author yingd
 */
public class MoveTest {

    public static void copy(String records1, String records2) throws IOException {
        try (InputStream is = new FileInputStream(records1); 
                OutputStream os = new FileOutputStream(records2);) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException | java.io.InvalidClassException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
//        Path p1 = Paths.get("E:\\IO\\1.png"); 
//        Path p2  = Paths.get("E:\\IO1\\1.png");
//        Files.move(p1, p2);
        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
    }

}
