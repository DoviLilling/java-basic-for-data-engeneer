package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Evgeny Borisov
 */
public class FileService implements Runnable {


    public void handleFile(File file, String data) throws FileNotFoundException {
        System.out.println(123);

        FileInputStream fileInputStream = new FileInputStream(file);

        System.out.println(456);
    }


    @Override
    public void run() {
        try {
            handleFile(new File("abc.txt"), "family = moshe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        Runnable runnable = new FileService();

        try {
            runnable.run();
        } catch (RuntimeException e) {
            System.out.println("problem");
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
            System.out.println(e);
            e.printStackTrace();

        }
    }


}






