package FileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        String path="D:/V/JAVA/lessons/src/FileTest/test.txt";
        File file =new File(path);
        PrintWriter writer= new PrintWriter(file);
        writer.println("запись в файл");
        writer.println("запись в файл 2 строка");
        writer.close();
    }
}
