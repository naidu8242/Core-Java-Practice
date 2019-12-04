package logicalPrograms;

import java.util.HashSet;

public class FindPairs {

	public static void main(String[] args) {
		int[] arr = {86,85,7,8};
		int sum = 1;
		System.out.println("Count :- " +pairs(arr,sum));
	}

	static int pairs( int[] arr,int k) {
//Mathod 1		
		 HashSet<Integer> map = new HashSet<>();
		    for(Integer it:arr){
		        map.add(it);
		    }
		    int pairCount = 0;
		    for(Integer it:arr){
		        if(map.contains(it-k)){
		            pairCount++;
		        }
		    }
		    return pairCount;
//Method 2  
//	    int res = 0;
//	    Map<Integer, Integer> complements = new HashMap<>();
//	    for (int el : arr) {
//	        if (complements.containsKey(el)) {
//	            res = res + complements.get(el);
//	        }
//	        if (el - k > 0) {
//	            complements.compute(el - k, (key, value) -> (value == null) ? 1 : value + 1);
//	        }
//	        complements.compute(el + k, (key, value) -> (value == null) ? 1 : value + 1);
//	    }
//	    return res;
	}
	 

}
