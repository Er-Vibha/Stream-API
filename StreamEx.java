import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        //Without Stream
        List<Integer> list = List.of(2, 6, 3, 8, 5, 4, 7, 9);
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println(listEven);
        //With Stream
        //First way
//        Stream<Integer> stream=list.stream();
//        List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);
        //Second way
        List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
