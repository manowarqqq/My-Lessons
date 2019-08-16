package FileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path="D:/V/JAVA/lessons/src/FileTest/test.txt";
        File file=new File(path);

        Scanner scanner= new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
