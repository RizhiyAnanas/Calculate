import java.util.Scanner;
public class Calculate {

    public static void main(String args[]) {
        int i = 0;
        int firtsNumber = 0;
        int secondNumber = 0;
        int example = 0;
        String firstSpace ="8";
        String secondSpace = "";
        String thirdSpace = "";

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.charAt(0) == 32 || str.charAt(str.length() - 1) == 32 || str.contains("  ")){
            System.out.println("Введите верное выражение))");
            return;
        }

         for (i = 0; i < str.length(); i++) {
             int ch = 0;
             if (str.charAt(i) == 32) {
                 ch++;
             }
             if (ch >= 3) {
                 System.out.println("Введите верное выражениеvv))");
                 return;
             }
         }
             firstSpace = toSpace(str);
             secondSpace = afterSpace(str);
             thirdSpace = afterSpace(secondSpace);
             secondSpace = toSpace(secondSpace);


             firtsNumber = toRomeNumbers(firstSpace);
             secondNumber = toRomeNumbers(thirdSpace);
             if (firtsNumber != 100 && secondNumber != 100) {

                 if (secondSpace.equals("+")){
                     System.out.println(fromArabNumbers(firtsNumber + secondNumber)); return;
                 } else if (secondSpace.equals("-")){
                     System.out.println(fromArabNumbers(firtsNumber - secondNumber));return;
                 } else if (secondSpace.equals("*")){
                     System.out.println(fromArabNumbers(firtsNumber * secondNumber));return;
                 } else if (secondSpace.equals("/")){
                     System.out.println(fromArabNumbers(firtsNumber / secondNumber));return;
                 } else {System.out.println("Введите верное выражение))");
                     return;
                 }
             }
             try {
                 firtsNumber = Integer.parseInt(firstSpace);
             } catch (NumberFormatException e) {
                 System.out.println("Введите верное выражение))");
                 return;
             }

             try {
                 secondNumber = Integer.parseInt(thirdSpace);
             } catch (NumberFormatException e) {
                 System.out.println("Введите верное выражение))");
                 return;
             }

             if (firtsNumber > 10 || secondNumber > 10 || firtsNumber < 1 || secondNumber < 1){
                 System.out.println("Вводите числа от 1 до 10))");
                 return;
             }

             if (secondSpace.length() != 1){
                 System.out.println("Введите верное выражение))");
                 return;
             }


        if (secondSpace.equals("+")){
            System.out.println(firtsNumber + secondNumber);
        } else if (secondSpace.equals("-")){
            System.out.println(firtsNumber - secondNumber);
        } else if (secondSpace.equals("*")){
            System.out.println(firtsNumber * secondNumber);
        } else if (secondSpace.equals("/")){
            System.out.println(firtsNumber / secondNumber);
        } else {System.out.println("Введите верное выражение))");
            return;
        }

        return;
    }

    public static String toSpace(String str) {
        String result = "";
        int i = 0;
        Character symbol = 0;
        for (i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol != 32) {
                result += str.charAt(i);
            } else{    return result; }

        }
        return result;
    }
    public static String afterSpace(String str) {
        String result = "";
        int i = 0;
        Character symbol = 0;
        for (i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == 32) {
                i++;
                while (i < str.length()) {
                    result += str.charAt(i);
                    i++;
                }
                return result;
            }

        }
        return result;
    }
    public static Integer toRomeNumbers(String str){
        if (str.equals("I")){
            return 1;
        }if (str.equals("II")){
            return 2;
        }if (str.equals("III")){
            return 3;
        }if (str.equals("IV")){
            return 4;
        }if (str.equals("V")){
            return 5;
        }if (str.equals("VI")){
            return 6;
        }if (str.equals("VII")){
            return 7;
        }if (str.equals("VIII")){
            return 8;
        }if (str.equals("IX")){
            return 9;
        }if (str.equals("X")){
            return 10;
        } else return 100;
    }

    public static String fromArabNumbers(int i) {
        int tens = i / 10;
        int remaind = i % 10;
        String strTens = "", strRemaind = "";
        if (remaind == 1) {
            strRemaind = "I";
        }
        if (remaind == 2) {
            strRemaind = "II";
        }
        if (remaind == 3) {
            strRemaind = "III";
        }
        if (remaind == 4) {
            strRemaind = "IV";
        }
        if (remaind == 5) {
            strRemaind = "V";
        }
        if (remaind == 6) {
            strRemaind = "VI";
        }
        if (remaind == 7) {
            strRemaind = "VII";
        }
        if (remaind == 8) {
            strRemaind = "VIII";
        }
        if (remaind == 9) {
            strRemaind = "IX";
        }

        if (tens == 1) {
            strTens = "X";
        }
        if (tens == 2) {
            strTens = "XX";
        }
        if (tens == 3) {
            strTens = "XXX";
        }
        if (tens == 4) {
            strTens = "XL";
        }
        if (tens == 5) {
            strTens = "L";
        }
        if (tens == 6) {
            strTens = "LX";
        }
        if (tens == 7) {
            strTens = "LXX";
        }
        if (tens == 8) {
            strTens = "LXXX";
        }
        if (tens == 9) {
            strTens = "XC";
        }if (tens == 10) {
            strTens = "C";
        }

        return strTens + strRemaind;

    }
}
