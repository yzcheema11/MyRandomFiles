//import javax.xml.bind.SchemaOutputResolver;
//import java.util.Scanner;
//
//public class Main2 {
//
//
//
//    private static final String[] specialNames = {
//            "",
//            "Thousand",
//            "Million",
//            "Billion",
//    };
//
//    private static final String[] tensNames = {
//            "",
//            "Ten",
//            "Twenty",
//            "Thirty",
//            "Forty",
//            "Fifty",
//            "Sixty",
//            "Seventy",
//            "Eighty",
//            "Ninety"
//    };
//
//    private static final String[] numNames = {
//            "",
//            "One",
//            "Two",
//            "Three",
//            "Four",
//            "Five",
//            "Six",
//            "Seven",
//            "Eight",
//            "Nine",
//            "Ten",
//            "Eleven",
//            "Twelve",
//            "Thirteen",
//            "Fourteen",
//            "Fifteen",
//            "Sixteen",
//            "Seventeen",
//            "Eighteen",
//            "Nineteen"
//    };
//
//    private String convertLessThanOneThousand(int number) {
//        String current;
//
//        if (number % 100 < 20){
//            current = numNames[number % 100];
//            number = number / 100;
//        }
//        else {
//            current = numNames[number % 10];
//            number = number / 10;
//
//            current = tensNames[number % 10] + current;
//            number = number / 10;
//        }
//        if (number == 0) return current;
//        return numNames[number] + "Hundred" + current;
//    }
//
//    public String convert(int number) {
//        String current = "";
//        int place = 0;
//        if (number == 0) {
//            String zero = "Zero";
//            return zero; }
//
//        do {
//            int n = number % 1000;
//            if (n != 0){
//                String s = convertLessThanOneThousand(n);
//                current = s + specialNames[place] + current;
//            }
//            place++;
//            number /= 1000;
//        } while (number > 0);
//
//        return (current).trim();
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("Enter Number to convert into words");
//        Main2 obj = new Main2();
//        Scanner num= new Scanner(System.in);
//        System.out.println("You're Number is... " + obj.convert(num.nextInt())+"Dollars");
//        //System.out.println("*** " + obj.convert());
//    }
//}
//
