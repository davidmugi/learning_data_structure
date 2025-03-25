package org.example.TwoPointerMedium;

public class ComparingStringsContainingBackspaces {

    public boolean compare(String str1, String str2) {
        // TODO: Write your code here

        int leftPointer = 0;
        int rightPointer = 0;

        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();



        while(leftPointer < str1.length()
                || rightPointer < str2.length()){

            if(leftPointer < str1.length() && str1Char[leftPointer] == '#'){
                for(int i = leftPointer;i < str1Char.length;i++){
                    if(i != str1Char.length - 1){
                        str1Char[i - 1] = str1Char[i + 1];
                        str1Char[i] = ' ';
                    } else {
                        str1Char[i] = ' ';
                        str1Char[i - 1] = ' ';
                    }
                }
                leftPointer--;
            }
            else if(rightPointer < str2.length() && str2Char[rightPointer] == '#'){
                for(int i = rightPointer;i < str2Char.length;i++){
                    if(i != str2Char.length - 1){
                         str2Char[i - 1] = str2Char[i + 1];
                         str2Char[i] = ' ';
                    } else {
                        str2Char[i] = ' ';
                        str2Char[i - 1] = ' ';
                    }
                }
                rightPointer--;
            } else {
                leftPointer++;
                rightPointer++;
            }

        }

        int leftChar = 0;

        int rightChar = 0;

        while(leftChar < str1Char.length - 1
                || rightChar < str2Char.length - 1){


            if(leftChar < str1Char.length -1
                    && str1Char[leftChar] == ' '){
                leftChar++;
                continue;
            }
            else if(rightChar < str2Char.length - 1 &&
                    str2Char[rightChar] == ' '){
                rightChar++;
                continue;
            }

            if(str1Char[leftChar] != str2Char[rightChar]){
                return false;
            } else {
                leftChar++;
                rightChar++;
            }
        }

        return true;
    }
}
