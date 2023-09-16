package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(findSymbolOccurnce("hello", 'l'));
        System.out.println(findWordPosition("helloWorld", "ld"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("radar"));
    }

    public static int findSymbolOccurnce(String str, char ch) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                res++;
            }
        }
        return res;
    }

    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        }
        return -1;
    }

    public static String stringReverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    public static boolean isPalindrome(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        if (res.equals(str)) {
            return true;
        }
        return false;
    }
}
