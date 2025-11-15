import java.lang.reflect.Array;
import java.util.*;

public class JavaEightFeatures {

    public static void main(String[] args) {
        int[] arr = {3,4,10,6,9,2};
        List<Integer> arrayList = Arrays.asList(3,4,10,6,9,2);


        // Immutable List
        List<Integer> immutableList = List.of(10,20,30);
//        immutableList.add(10);


        System.out.println(" Without java 8 Feature");
        for(int i : arrayList) {
            System.out.print(i+ " ");
        }

        System.out.println();

        System.out.println("With Java 8 Feature");
        System.out.println("Sorting");
        System.out.println("---------");
        arrayList.stream()
                .sorted()
                .forEach(i -> System.out.print(i+ " "));

        System.out.println();
        System.out.println("Print Even Numbers");
        System.out.println("---------------------");

        arrayList.stream()
                .filter((i) -> i%2==0)
                .map((i) -> i*10)
                .forEach(i -> System.out.print(i+ " "));


        System.out.println();
        System.out.println("All Match/ Any Match/ None Match");
        System.out.println("----------------------------------");

        boolean allMatch = arrayList.stream()
                .allMatch(i -> i % 2 == 0);
        System.out.println("All match -> "+ allMatch);

        System.out.println("Any Match -> "+ arrayList.stream().anyMatch(i -> i%2==0));

        System.out.println("None Match -> "+ arrayList.stream().noneMatch(i -> i%2 ==0));

        System.out.println("FindFirst -> TopK Highest Element");
        System.out.println("-----------------------------------");
        int k = 2;
        Optional<Integer> first = arrayList.stream()
                .sorted(Collections.reverseOrder())
                .skip(k-1)
                .findFirst();

        if(first.isPresent()) {
            System.out.println(first.get());
        }

        System.out.println("FindAny ");
        System.out.println("----------");
        int findAny = arrayList.stream()
                .findAny()
                .orElse(0);

        System.out.println(findAny);


        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<-----------Optional Class ----------------------------->>>>>>>>>>>>>");






        // Array Stream
//        Arrays.stream(arr)
//                .forEach(i -> System.out.print(i+ " "));
    }
}
