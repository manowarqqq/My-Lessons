package Array;

import java.util.ArrayList;
import java.util.List;

public class ExampleArray {
    public static void main(String[] args) {
        List<String> newList=new ArrayList<>();
        newList.add("string1");
        newList.add("string2");
        newList.add("string3");

        String s=newList.get(1);
        System.out.println(s);
    }

}
