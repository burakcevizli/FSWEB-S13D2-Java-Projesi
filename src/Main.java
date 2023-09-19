public class Main {
    public static void main(String[] args) {
        //Ödev 1
        System.out.println(isPalindrome(121));
        //Ödev 2

        System.out.println(isPerfectNumber(-1));

        //Ödev 3

        System.out.println(numberToWords(1010));

    }

    //Ödev 1 Fonksiyon
    public static boolean isPalindrome(int param) {
        String sayiString = String.valueOf(param);
        sayiString = sayiString.replaceAll("-", "");
        int lenght = sayiString.length();

        for (int i = 0; i < lenght / 2; i++) {
            if (sayiString.charAt(i) != sayiString.charAt(lenght - 1)) {
                return false;
            }
        }
        return true;
    }

    //Ödev 2 Fonksiyon

    public static boolean isPerfectNumber(int param) {
        int sonuc = 0;
        if (param <= 0) {
            return false;
        }

        for (int i = 1; i <= param / 2; i++) {
            if (param % i == 0) {
                sonuc = sonuc + i;
                if (sonuc == param) {
                    return true;
                }

            }
        }
        return false;
    }


    //Ödev 3 fonksiyon

    public static String numberToWords(int param) {
        if (param < 0) return "INVALID VALUE";

        String paramInteger = String.valueOf(param);
        String[] paramArray = paramInteger.split("");
        for (String each : paramArray) {
            switch (each) {
                case "0":
                    System.out.print("Zero ");
                    break;
                case "1":
                    System.out.print(" One ");
                    break;
                case "2":
                    System.out.print(" Two ");
                    break;
                case "3":
                    System.out.print(" Three ");
                    break;
            }
        }
        return paramInteger;
    }


}