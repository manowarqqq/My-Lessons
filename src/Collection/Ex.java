
package Collection;
import java.util.*;

import java.util.ArrayList;

public class Ex {
    public static void main(String[] args) {
        Generator gen=new Generator();
   String[] a=new String[4];


        System.out.println(gen.fill(new ArrayList<String>(),5));
        System.out.println(gen.fill(new LinkedList<String>(),5));
        System.out.println(gen.fill(new HashSet<String>(),5));
        System.out.println(gen.fill(new LinkedHashSet<>(),5));
        System.out.println(gen.fill(new TreeSet<>(),5));




    }
}
