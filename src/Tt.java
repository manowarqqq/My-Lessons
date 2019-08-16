import java.util.HashMap;
import java.util.Map;

public class Tt {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
                map.put("First","pervii");
                map.put("Second","vtoroi");
                map.put("Third","Tretii");
        for(Map.Entry<String,String> m:map.entrySet()){
            String key= m.getKey();
            String value=m.getValue();
            System.out.println(key+":"+value);
        }

    }
}
