package CodeWars.persist;

public class Persist {


    public static int multiple(int[] arr) {

        int mult = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            mult *= arr[i];
        }
        return mult;
    }

    public static int[] numToarr(long n) {
        String number = Long.toString(n);
        int[] digit = new int[number.length()];
        for (int i = 0; i < digit.length; i++) {
            digit[i] =Character.digit(number.charAt(i),10);
        }
        return digit;
    }


    public static int persistence(long n) {
        if(n<10) return 0;
        int[] digit = numToarr(n);
        int counter = 1;
        int multResult = multiple(digit);

        while (multResult >=10) {
            counter++;
            int[] temp = numToarr(multResult);
            multResult = multiple(temp);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(persistence(263162));
    }s


}
