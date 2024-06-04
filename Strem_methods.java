import java.util.List;
import java.util.stream.Collectors;

public class Strem_methods {
    public static void main(String[] args) {
        //Filter
        List<String> list = List.of("Raja", "Rani", "Seema", "Sachin");
        List<String> newList = list.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
        System.out.println(newList);

        //Map Exapmle 1
        List<String> list1 = List.of("Vibha");
        List<String> newList1 = list1.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList1);

        //Map Example 2
        List<Integer> list2 = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newList2 = list2.stream().map(a -> a * a).collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
        System.out.println(newList2);

        //Sort
        List<Integer> list3 = List.of(2, 6, 7, 8, 9, 3, 4, 5, 2);
        list3.stream().sorted().forEach(System.out::println);

        //Min
        List<Integer> list4 = List.of(3, 6, 7, 9, 4, 5, 0);
        Integer minval = list4.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min value is:" + minval);

        //Max
        Integer maxval = list4.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max value is:" + maxval);
    }
}
