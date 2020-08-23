package assessment;

public class Logics {
    public static int binaryReversal(String str) {
        if(str.matches("\\d+")) {
            int number = Integer.parseInt(str);
            String binaryStr = Integer.toBinaryString(number);

            if(number >= 255) {
                return 255;
            }

            if(binaryStr.length() < 8) {
                int counter = 0;
                int beginningLength = 8 - binaryStr.length();

                while(counter < beginningLength) {
                    binaryStr = "0" + binaryStr;
                    counter++;
                }
            }

            String finalString = "";

            for(int i=binaryStr.length()-1; i>=0; i--) {
                finalString += binaryStr.charAt(i);
            }

            int decimal = Integer.parseInt(finalString, 2);

            return decimal;

        } else {
            return -1;
        }
    }
}
