
import java.util.ArrayList;

public class PrintAllSubArraybyArraylist {

    public static void printSubArrays(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {

                list.add(arr[j]);

                System.out.println(list);
            }

        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        printSubArrays(arr);
    }
}
