package com.sajan;


public class Alphabets {
    public static void main(String[] args) {
        System.out.println((int) 'A'); // a-z 97-122
        System.out.println((int)'B');   // 65- 90


        String s = "heLlo";
        char[] data = new char[s.length()];
        int i =0;
        for(char c : s.toCharArray()){
            int charNum = c;
            if(charNum >= 97 && charNum <=122){
                charNum = charNum-32;
            } else if(charNum >= 65 && charNum<=90){
                charNum = charNum + 32;
            }
            System.out.println((char)charNum);
            data[i] = (char)charNum;
            i++;
        }
        System.out.println(String.copyValueOf(data));
    }
}
