import java.sql.SQLOutput;
import java.util.Arrays;

public class xszpx {
    public static void main(String[] args) {
        System.out.println("原数组:");

        int []array=new int[]{1,2,-1,5,-2};
        System.out.print(Arrays.toString(array));
        System.out.print("\n");
        System.out.println("排序后的数组:");
        int []newArray= Arrays.copyOf(array,5);
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

    }
}
