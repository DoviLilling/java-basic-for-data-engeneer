package exceptions;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileService fileService = new FileService();
        fileService.handleFile(new File("sdfsdfd"));
        System.out.println(666);
    }
}
