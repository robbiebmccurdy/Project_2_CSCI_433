import java.util.Random;

public class test {
    public static void main(String[] args) {
       Sorts sort = new Sorts();
       int numOfArrays = Integer.parseInt(args[1]);
       int sizeOfArray = Integer.parseInt(args[2]);

       int[][] arrayOfArrays = new int[numOfArrays][sizeOfArray];

       Random random = new Random();
       for(int i = 0; i < numOfArrays; i++){
           for(int j = 0; j < sizeOfArray - 1; j++){
               arrayOfArrays[i][j] = random.nextInt();
           }
       }

       switch(args[0].toLowerCase()){
           case "selection":
               System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Selection Sort...");
               long nano_startTimeSelection = System.nanoTime();
               for(int i = 0; i < numOfArrays; i++){
                   sort.SelectionSort(arrayOfArrays[i]);
               }
               long nano_endTimeSelection = System.nanoTime();
               System.out.println("Selection Sort Time: " + (nano_endTimeSelection - nano_startTimeSelection));
               break;
           case "insertion":
               System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Insertion Sort...");
               long nano_startTimeInsertion = System.nanoTime();
               for(int i = 0; i < numOfArrays; i++){
                   sort.InsertionSort(arrayOfArrays[i]);
               }
               long nano_endTimeInsertion = System.nanoTime();
               System.out.println("Insertion Sort Time: " + (nano_endTimeInsertion - nano_startTimeInsertion));
               break;
           case "bubble":
               System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Bubble Sort...");
               long nano_startTimeBubble = System.nanoTime();
               for(int i = 0; i < numOfArrays; i++){
                   sort.BubbleSort(arrayOfArrays[i]);
               }
               long nano_endTimeBubble = System.nanoTime();
               System.out.println("Selection Sort Time: " + (nano_endTimeBubble - nano_startTimeBubble));
               break;
           case "merge":
               System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Merge Sort...");
               long nano_startTimeMerge = System.nanoTime();
               for(int i = 0; i < numOfArrays; i++){
                   sort.MergeSort(arrayOfArrays[i]);
               }
               long nano_endTimeMerge = System.nanoTime();
               System.out.println("Selection Sort Time: " + (nano_endTimeMerge - nano_startTimeMerge));
               break;
           case "quick":
               System.out.println("Sorting " + numOfArrays + " at size " + sizeOfArray + " with Quick Sort...");
               long nano_startTimeQuick = System.nanoTime();
               for(int i = 0; i < numOfArrays; i++){
                   sort.QuickSort(arrayOfArrays[i], 0, sizeOfArray - 1);
               }
               long nano_endTimeQuick = System.nanoTime();
               System.out.println("Selection Sort Time: " + (nano_endTimeQuick - nano_startTimeQuick));
               break;
       }
    }
}

