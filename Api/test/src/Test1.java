import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("a");
        arrayList.add("ab");
        arrayList.add("abc");
        arrayList.add("abcd");
        String max=Collections.max(arrayList);
        String min=Collections.min(arrayList);
        System.out.println(max);
        System.out.println(min);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList,"a"));
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.fill(arrayList,"love");
        System.out.println(arrayList);

    }
}
