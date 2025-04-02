package org.example.fastslowpointer.medium;

public class HappyNumber {

    public boolean find(int num) {

        int slowValue = calSumOfSquare(num,1);
        int fastValue = calSumOfSquare(slowValue,2);

        if(fastValue == 1){
            return true;
        }

        do{
          slowValue = calSumOfSquare(slowValue , 1);
          fastValue = calSumOfSquare(fastValue,2);

          if(fastValue == 1){
              return true;
          }

          if(slowValue == fastValue){
              return false;
          }

        }while (slowValue != fastValue);

        return false;
    }

    private int calSumOfSquare(int num,int steps){
        char[] intArray = String.valueOf(num).toCharArray();
        int sum = 0;

        if(steps == 0){
            return num;
        }

        for (char c : intArray) {
            sum = sum + (Character.getNumericValue(c) * Character.getNumericValue(c));
        }

        return calSumOfSquare(sum,steps - 1);
    }

}
