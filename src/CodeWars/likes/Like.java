package CodeWars.likes;

public class Like {

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return names[0]+" likes this";
            case 2: return  names[0]+" and "+ names[1]+" likes this";
            case 3: return names[0]+", "+names[1]+" and "+ names[2]+" likes this";
            default: return names[0]+", "+names[1]+" and "+(names.length-2)+" others like this";
        }
    }


    public static void main(String[] args) {
          System.out.println(whoLikesIt());
          System.out.println(whoLikesIt("Jacob", "Alex"));
          System.out.println(whoLikesIt("Max", "John", "Mark"));
          System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));

    }
}


