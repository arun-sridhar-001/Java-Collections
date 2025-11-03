import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] num = {10, 89, 15, 50};

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(90);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(55);


        System.out.println(arrayList.size());

        System.out.println(Collections.max(arrayList));

        Collections.sort(arrayList);

        for(int c : arrayList) {
            System.out.println(c);
        }

    }

}