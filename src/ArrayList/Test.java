package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<10;i++) {
            ar.add(i);
        }
        ar.remove(5);
        ar.add(5);
        System.out.println(ar.toString());

    }
}
