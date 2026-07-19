package Array;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
//TC On²

//import java.util.HashSet;
//
//public class RemoveDuplicate {
//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 10, 30, 20, 40};
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        System.out.println(set);
//    }
//}

//import java.util.LinkedHashSet;
//
//public class RemoveDuplicateArray {
//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 10, 30, 20, 40};
//
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        System.out.println(set);
//    }
//}

//import java.util.TreeSet;
//
//public class RemoveDuplicateArray {
//    public static void main(String[] args) {
//
//        int[] arr = {30, 10, 20, 10, 40, 20};
//
//        TreeSet<Integer> set = new TreeSet<>();
//
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        System.out.println(set);
//    }
//}