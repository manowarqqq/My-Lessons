package CodeWars.TheSame;

import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        for (int i=0;i<a.length;i++) {
            a[i]=Math.abs(a[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<b.length;i++) {

                if ((Math.sqrt(b[i])) % 1 == 0) {
                    b[i] = (int) Math.sqrt(b[i]);
                }
            }

            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
if(Arrays.compare(a,b)==0)
    return true;

        return false;
    }

    public static void main(String[] args) {

        int[] a = new int[]{0,-14,191,161,19,144,195,1};
        int[] b = new int[]{1,0,196,36481,25921,361,20736,38025};
        System.out.println(comp(a,b));
    }

}
