package Serialize;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
Person person1=new Person(5,"Petro");
Person person2=new Person(1,"Victor");




try (ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("writefile.bin"))) {
    //  FileOutputStream stream=new FileOutputStream("writefile.bin");
    //  ObjectOutputStream os=new ObjectOutputStream(stream);
    os.writeObject(person1);
    os.writeObject(person2);
    //   os.close();    (При try_with_resources не нужно закрывать поток; реализуется у классов implem. от Closable )

}
    }
        }
