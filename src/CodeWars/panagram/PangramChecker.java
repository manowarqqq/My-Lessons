package CodeWars.panagram;

public class PangramChecker {
    public static  boolean check(String sentence) {

String sentenceWithOutMeta=sentence.replaceAll("[\\d\\s.,]","");
if (sentenceWithOutMeta.length()<26) return false;
 long distinctLength= sentenceWithOutMeta.toLowerCase().chars().distinct().count();
 return distinctLength == 26;
    }
    public static void main(String[] args) {
        System.out.println(check("qwert , . asdfg , zxcvbB"));
    }


    }