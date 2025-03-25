package org.example.TwoPointerMedium;

public class DutchNationalFlag {

    public int[] sort(int[] arr) {
        // TODO: Write your code here

      int low = 0;

      int high = arr.length - 1;

       for(int i = 0;i <= high;){

           if(arr[i] == 0){
               int prevI = arr[i];
               arr[i] = arr[low];
               arr[low] = prevI;
               low = low + 1;
               i++;
           } else if (arr[i] == 2){
               int prevI = arr[i];
               arr[i] = arr[high];
               arr[high] = prevI;
               high = high - 1;
           } else {
               i++;
           }
       }

       return arr;
    }
}
