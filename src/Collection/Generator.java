package Collection;

import java.util.Collection;

public class Generator {
    int key;

    public String next() {
        switch (key) {
            default:
            case 0:
                key++;
                return "First";
            case 1:
                key++;
                return "Second";
            case 2:
                key++;
                return "Third";
            case 3:
                key++;
                return"Third";

            case 4:
                key = 0;
                return "Last";
        }

    }

    public void fillA(String[] a){
        for(int i=0;i<a.length;i++)
            a[i]=next();

    }
            public Collection fill(Collection<String> c,int n) {
        for(int i=0;i<n;i++)
            c.add(next());
        return c;
            }

        }



