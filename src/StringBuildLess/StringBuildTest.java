package StringBuildLess;

public class StringBuildTest {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        String[] ar=new String[]{"a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j"};
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<ar.length;i++){
          sb.append(ar[i]);
      }
        System.out.println(sb);
      long time= System.currentTimeMillis()-startTime;
        System.out.println(time);

    }
   }
