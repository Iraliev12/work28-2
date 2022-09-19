
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Collection<Integer> list1 = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
     List<Integer>list= Collections.singletonList(list1.stream().mapToInt((x) ->
             Integer.parseInt(x.toString())).sum());
        System.out.println(list1);
     OptionalDouble list2 =list.stream().mapToInt((x)->Integer.parseInt((String.valueOf(x)))).average();
        System.out.println(list2);
    }
}
