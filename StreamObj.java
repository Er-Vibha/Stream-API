import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObj {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Banana", "Grapes", "Mango"};
//        List<Integer> list=List.of(2,1,3,4221,3221,233,232,23,3,45);
//        Stream<Integer> st=list.stream();
//        List<Integer> l=list.stream().filter(i->i>45).collect(Collectors.toList());
//        System.out.println(l);
//Stream API
//1
        Stream<Object> emptySt = Stream.empty();
        emptySt.forEach(e -> {
            System.out.println(e);
        });
//2
        Stream<String> stream = Stream.of(fruit);
        stream.forEach(a -> {
            System.out.println(a);
        });
//3
        Stream<Object> stream1 = Stream.builder().build();
//4
        IntStream stream2 = Arrays.stream(new int[]{2, 3, 4, 5, 6, 7});
        stream2.forEach(a -> {
            System.out.println(a);
        });
//5
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(9);
        Stream<Integer> st = list.stream();
        st.forEach(e -> {
            System.out.println(e);
        });
    }
}
