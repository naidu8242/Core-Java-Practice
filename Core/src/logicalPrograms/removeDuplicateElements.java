package logicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicateElements {

	 public static void main(String[] args) {
//	        int[] array = {11, 14, 17, 11, 48, 33, 29, 11, 17, 22, 11, 48, 18};
//	        ArrayList<Integer> list = new ArrayList<>(array.length);
//	        for (int i = 0; i < array.length; i++) {
//	            list.add(array[i]);
//	        }
//
//	        Set<Integer> dup = new HashSet<>(list);
//
//	        dup.stream().forEach((key) -> {
//	            System.out.print((Collections.frequency(list, key) > 2) ? key + ": " + Collections.frequency(list, key) +"\n" : "");
//	        });
		 
		 
		 int[] array = {11, 14, 17, 11, 48, 33, 29, 11, 17, 22, 11, 48, 18};

		 List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

		 // print values appearing more than once
		 list.stream().filter(i -> Collections.frequency(list, i) >1)
		         .collect(Collectors.toSet()).forEach(System.out::println);
	    }

}
