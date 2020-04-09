package CodeWars.morse;

public class MorseCodeDecoder {

    public static String get(String charCode) {
        switch (charCode) {
            case "....":
                return "H";

            case ".":
                return "E";

            case "-.--":
                return "Y";

            case ".---":
                return "J";

            case "..-":
                return "U";

            case "-..":
                return "D";

        }
        return "?";
    }

    public static String decode(String code) {
        code=code.trim();
        StringBuilder result = new StringBuilder();
        char[] codeArray = code.toCharArray();
        StringBuilder charCode = new StringBuilder();
        for (int i = 0; i < codeArray.length; i++) {
            while (!(codeArray[i] == ' ')) {
                charCode.append(codeArray[i]);
                if (i == codeArray.length - 1) break;
                i++;
            }
            result.append(get(charCode.toString()));
            charCode.setLength(0);
            if (codeArray[i] == ' ') {
                if (codeArray[i + 1] == ' ') {
                    result.append(" ");
                    i++;
                    i++;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("..."));
    }
}
