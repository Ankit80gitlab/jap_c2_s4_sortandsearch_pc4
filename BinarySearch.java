package com.jap.binarysearch;


public class BinarySearch {
    // Declare a variable to track the number of comparisons within the array
    static int numberOfComparisons = 0;
    public static void main(String[] args) {

        // Declare arrays cityNames and distances
        // Note that the arrays must be in sorted order
        String cityNames[] = {"Lucerne", "Engelberg", "Basel", "Jungfraujoch", "Murren", "InterLaken", "Grindelwald", "Bern", "Zermatt", "Geneva"};
        int distances[] = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};

        // Declare the variable with the distance to be searched
        int distanceToBeSearched = 52;

        BinarySearch binarySearch = new BinarySearch();
        // Call the method to search the array
		binarySearch.search(distances,cityNames,distanceToBeSearched);
        String result = null;

        // print the result

    }

    // Function to search the city at 52 kms from Zurich
    public String search(int[] distanceArray,String cityNames[], int distanceFromZurich) {

		
        int l = 0;
        int h = distanceArray.length - 1;
        int mid = (l + h) / 2;
		String result=null;

        while (l<=h) 
        {
            if (distanceArray[mid] == distanceFromZurich) {
                result=cityNames[mid]; 
                break;

            } else if (distanceArray[mid] < distanceFromZurich) {
                l = mid + 1;

            } else  {
                h = mid - 1;

            }
            mid=(l+h)/2;

        }
        if (l>h)
        {
            result="City Not Found";
        }

        return result;
    }
}
       
