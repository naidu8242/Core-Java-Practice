package logicalPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		Integer arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		 System.out.println("Second Largest: "+getSecondLargest(arr,arr.length));  
	}

	private static int getSecondLargest(Integer[] arr, int total) {
		//Method 1
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		int element = list.get(total-2);
//		return element;

		//Method 2
		Arrays.sort(arr);
		return arr[total-2];
	}

}
