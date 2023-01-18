package algorithms;

import java.util.Arrays;

/*
* input: sorted list of elements, searched element
* output: position of searched element if it is present or null if it's not
* */
public class BinarySearch {
    public int binarySearch(int[] array, int element){
        //indexes
        int low=0;
        int high=array.length-1;

        while (low<=high){
            int middle=(low+high)/2;
            int guess=array[middle];

            if (guess==element){//found
                return  middle;
            }
            else if (element>guess){//too low, it is in the right subarray
                low=middle+1;
            }
            else{//too high, it is in the left subarray
                high=middle-1;
            }
        }
        return -1;
    }
}
