/*
Assignment: Programming Assignment #2
Course: CSCI 433
Professor: Yixin Chen
Name: Robert McCurdy
Brief Description:
This program takes in three command arguments from the command line. The three arguments are the name of the sort (i.e. merge, selection, etc), the number
of arrays, and the size of each array. A double array is created to store each of the unsorted arrays. A for loop then randomly generates numbers for each array.
After the for loop, a switch case is implemented to determine which sorting method will be used based on the first command line argument. In each case, the
nanoTime is recorded and outputted after the function has finished to display the time taken during the function.
*/

import java.util.Random;

public class test {
    public static void main(String[] args) {
        //instance of Sort class
       Sorts sort = new Sorts();
       //records the 2nd and 3rd command line argument and stores them as the # of arrays and the size of each array
       int numOfArrays = Integer.parseInt(args[1]);
       int sizeOfArray = Integer.parseInt(args[2]);
        //double array to hold our arrays before they're sorted
       int[][] arrayOfArrays = new int[numOfArrays][sizeOfArray];

       //random object used later for randomly generating numbers
       Random random = new Random();
       //for loop to populate the arrays in arrayOfArrays with randomly generated numbers
       for(int i = 0; i < numOfArrays; i++){
           for(int j = 0; j < sizeOfArray - 1; j++){
               arrayOfArrays[i][j] = random.nextInt();
           }
       }
        //switch case based on the first command line argument, toLowerCase to prevent errors. Switches based on the input and runs the appropriate sort
        switch (args[0].toLowerCase()) {
            case "selection" -> {
                System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Selection Sort...");
                long nano_startTimeSelection = System.nanoTime(); //records the time before the function
                for (int i = 0; i < numOfArrays; i++) {
                    sort.SelectionSort(arrayOfArrays[i]);
                }
                long nano_endTimeSelection = System.nanoTime(); //records the time after the function
                System.out.println("Selection Sort Time: " + (nano_endTimeSelection - nano_startTimeSelection)); //calculate time taken by subtracting the time after the function (end) by the time before the function (start)
            }
            case "insertion" -> {
                System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Insertion Sort...");
                long nano_startTimeInsertion = System.nanoTime(); //records the time before the function
                for (int i = 0; i < numOfArrays; i++) {
                    sort.InsertionSort(arrayOfArrays[i]);
                }
                long nano_endTimeInsertion = System.nanoTime(); //records the time after the function
                System.out.println("Insertion Sort Time: " + (nano_endTimeInsertion - nano_startTimeInsertion)); //calculate time taken by subtracting the time after the function (end) by the time before the function (start)
            }
            case "bubble" -> {
                System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Bubble Sort...");
                long nano_startTimeBubble = System.nanoTime(); //records the time before the function
                for (int i = 0; i < numOfArrays; i++) {
                    sort.BubbleSort(arrayOfArrays[i]);
                }
                long nano_endTimeBubble = System.nanoTime(); //records the time after the function
                System.out.println("Selection Sort Time: " + (nano_endTimeBubble - nano_startTimeBubble)); //calculate time taken by subtracting the time after the function (end) by the time before the function (start)
            }
            case "merge" -> {
                System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Merge Sort...");
                long nano_startTimeMerge = System.nanoTime(); //records the time before the function
                for (int i = 0; i < numOfArrays; i++) {
                    sort.MergeSort(arrayOfArrays[i]);
                }
                long nano_endTimeMerge = System.nanoTime(); //records the time after the function
                System.out.println("Selection Sort Time: " + (nano_endTimeMerge - nano_startTimeMerge)); //calculate time taken by subtracting the time after the function (end) by the time before the function (start)
            }
            case "quick" -> {
                System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Quick Sort...");
                long nano_startTimeQuick = System.nanoTime(); //records the time before the function
                for (int i = 0; i < numOfArrays; i++) {
                    sort.QuickSort(arrayOfArrays[i], 0, sizeOfArray - 1);
                }
                long nano_endTimeQuick = System.nanoTime(); //records the time after the function
                System.out.println("Selection Sort Time: " + (nano_endTimeQuick - nano_startTimeQuick)); //calculate time taken by subtracting the time after the function (end) by the time before the function (start)
            }
        }
    }
}

