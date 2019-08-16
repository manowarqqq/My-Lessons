package Serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream is=new FileInputStream("writefile.bin");
        ObjectInputStream ois=new ObjectInputStream(is);
        Object obj=ois.readObject();
        //or
        //Person person1=(Person) ois.readObject();
ois.close();
        System.out.println(obj);
    }
}
