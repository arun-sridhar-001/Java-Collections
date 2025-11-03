package arrayList;

import java.util.*;
// limitation in Array->
// store only homogenous dataType
// limitation in size

public class ArrayListCheatSheet {

    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[6] = 20;
//        Arrays.stream(arr).forEach(System.out::println);

        // Generics based ArrayList
        List<Integer> list = new ArrayList<>();

        List l = new ArrayList();
        l.add(10);
        l.add("Arun");
        l.add(2, false);
        l.add(true);

        List l2 = new ArrayList();
        l2.add("Java");
        l2.add("Python");


        //  indexBased access
        String str =(String) l.get(1);
        Boolean b = (Boolean) l.get(2);
        Object s  = l.get(1);

        System.out.println("Index based Access "+s);

        // remove
        l.remove("Arun");


       Boolean empty = l.isEmpty();
       System.out.println(" Is Empty -----------> "+ empty);



        System.out.println("ArrayList Size "+l.size());
        l.set(0, 50);

        l.addAll(l2);

        int index = l.indexOf("Python");
        System.out.println("Python Index "+ index);

        Boolean containsJava = l.contains("Java");
        Boolean containsJs = l.contains("JS");
        System.out.println("Is Contains search java "+ containsJava);
        System.out.println("Is Contains search js "+ containsJs);

        System.out.println("ArrayList size after Add All "+l.size());


        for(Object lists : l) {   // O(n)
            System.out.println(lists);
        }


        l.clear();
        System.out.println("Cleared the elements");
        l.stream().forEach(System.out::println);
    }
}
