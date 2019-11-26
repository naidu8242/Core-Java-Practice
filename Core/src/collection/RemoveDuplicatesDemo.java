package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesDemo {

    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Kolkata");
        cityList.add("Mumbai");
        
       /* List<String> newList = new ArrayList<>();
        for(String name : cityList){
            if(!newList.contains(name)){
                newList.add(name);
            }
        }*/

        
        
        // creating a hashset using the list
        Set<String> citySet = new HashSet<String>(cityList);
        // remove all the elements from the list 
        cityList.clear();
        // add all the elements of the set to create a
        // list with out duplicates
        cityList.addAll(citySet);
        
        
        
        Set<String> cityHashSet = new LinkedHashSet<String>(cityList);
        // remove all the elements from the list 
        cityList.clear();
        // add all the elements of the set to create a
        // list with out duplicates
        cityList.addAll(cityHashSet);
        
        //java 8
        cityList.stream().distinct().collect(Collectors.toList());
        Collections.sort(cityList);
        
        for(String name : cityList){
            System.out.println("City Name - " + name);
        }
    }
}