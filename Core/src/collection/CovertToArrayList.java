package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CovertToArrayList {
    public static void main(String[] args) {
         String cityArray[] = {"Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai"};
         //Converting array to List
         List<String> cityarrayList = Arrays.asList(cityArray);
         for(String name : cityarrayList){
            System.out.println("City : " + name);
         } 
         
         //Collections.addAll
         List<String> cityList= new ArrayList<String>();
         Collections.addAll(cityList, cityArray);
         cityList.add("Pune");
         for(String name : cityList){
            System.out.println("City : " + name);
         }   
         
         
         //Java 8
         List<String> java8List= Stream.of(cityArray).collect(Collectors.toList());
         java8List.forEach(System.out::println);
         
         java8List.stream().forEach(a->System.out.println("name >>> "+a));
    }
}