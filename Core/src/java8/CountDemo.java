package java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class CountDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","AB","CC");
        Predicate<String> predicate = s-> s.startsWith("A");
        long l= list.stream().filter(predicate).count();
        System.out.println("Number of Matching Element:"+l);
    }
} 