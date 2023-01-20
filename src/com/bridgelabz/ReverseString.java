package com.bridgelabz;

public class ReverseString {

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();//creating object of ReverseString class
        reverseString.checkStringIsReverse();//using object reference calling checkStringIsReverse method
    }

    //method of checkStringIsReverse
    public void checkStringIsReverse() {
        char[] ch = {'v', 'i', 'n', 'a', 'y', 'a', 'k'};
//        String str1 = new String(ch);//creating object of string and passing ch
        String str1 = String.valueOf(ch);
        System.out.println(str1);//print that str
        String revStr = "";//initialize revStr variable
        //taking for loop for reverse string
        for (int i = str1.length() - 1; i >= 0; i--) {
            revStr = revStr + str1.charAt(i);//ihbarus
        }
        System.out.println("String is :" + str1);//print original string// surabhi
        System.out.println("Reverse of given string: " + revStr);//print reverse string//ihbarus
    }
}