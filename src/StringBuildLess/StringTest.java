package StringBuildLess;
import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        String[] ar=new String[]{"a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j"};
        String all="";
for(int i=0; i<ar.length;i++) {
      all=all+ar[i];
}
Object o
        System.out.println(all);
long  time= System.currentTimeMillis()-startTime;
        System.out.println(time);
    }
}
