public class Main {
    public static void main(String[] args) {
        int[] arr = {3,9,1,8,6,7,2,13,11};
        int arrSize = arr.length;

        System.out.println("...........................");
        System.out.println("Bubble Sorting");
        System.out.println("...........................");
        BubbleSort bubbleSort = new BubbleSort();
        System.out.print("Array is: ");
        bubbleSort.printSortedArray(arr);
        System.out.println();
        arr = bubbleSort.performBubbleSort(arr, arrSize);
        bubbleSort.printSortedArray(arr);
        System.out.println("...........................");
        System.out.println("...........................");
        System.out.println("Selection Sorting");
        System.out.println("...........................");
        arr = new int[]{ 7, 2, 13, 11,3, 9, 1, 8, 6};
        SelectionSort selectionSort = new SelectionSort();
        System.out.print("Array is: ");
        selectionSort.printArray(arr);
        System.out.println();
        arr = selectionSort.performSelectionSort(arr, arrSize);
        selectionSort.printArray(arr);
        System.out.println("...........................");
        System.out.println("...........................");
    }
}

/*

Output:
...........................
Bubble Sorting
...........................
Array is: Sorted array:
3 9 1 8 6 7 2 13 11

Sorted array:
1 2 3 6 7 8 9 11 13
...........................
...........................
Selection Sorting
...........................
Array is: Sorted array:
7 2 13 11 3 9 1 8 6

Sorted array:
1 2 3 6 7 8 9 11 13
...........................
...........................
 */