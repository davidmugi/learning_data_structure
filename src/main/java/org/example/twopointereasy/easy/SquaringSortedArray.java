package org.example.twopointereasy.easy;

public class SquaringSortedArray {

    public int[] makeSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        int rightPointer = arr.length - 1;
        int leftPointer = 0;
        int largestSquare = squares.length - 1;

        while (leftPointer <= rightPointer) {
            int rightSquare = arr[rightPointer] * arr[rightPointer];
            int leftSquare = arr[leftPointer] * arr[leftPointer];
            if (rightSquare > leftSquare) {
                squares[largestSquare] = rightSquare;
                rightPointer--;
                largestSquare = largestSquare - 1;
            } else {
                squares[largestSquare] = leftSquare;
                leftPointer++;
                largestSquare = largestSquare - 1;
            }
        }


        // TODO: Write your code here
        return squares;
    }
}
