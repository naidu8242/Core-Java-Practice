package collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class HashMapSorting {

    public static void main(String[] args) {
        Map<String, String> langMap = new HashMap<String, String>();
        langMap.put("ENG", "English");
        langMap.put("NLD", "Dutch");
        langMap.put("ZHO", "Chinese");
        langMap.put("BEN", "Bengali");
        langMap.put("ZUL", "Zulu");
        System.out.println("-- Original Map --");
        for(Map.Entry<String, String> lang : langMap.entrySet()) {
            System.out.println("Key- " + lang.getKey() + 
                          " Value- " + lang.getValue());
        }
        // Creating TreeSet with a comparator
        TreeSet<Map.Entry<String, String>> langSet = new TreeSet<Map.Entry<String, String>>(
                new Comparator<Map.Entry<String, String>>(){

                    @Override
                    public int compare(Entry<String, String> entry1,
                            Entry<String, String> entry2) {
                        return entry1.getValue().compareTo(entry2.getValue());
                    }
                    
                });
        // Adding Map.entrySet to TreeSet
        langSet.addAll(langMap.entrySet());
        
        Map<String, String> newMap = new LinkedHashMap<String, String>();
        // Insert values in LinkedHashMap
        for(Map.Entry<String, String> entry : langSet) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("-- Sorted Map(by Value) --");
        for(Map.Entry<String, String> lang : newMap.entrySet()) {
            System.out.println("Key- " + lang.getKey() + " Value- " + lang.getValue());
        }
    }
}