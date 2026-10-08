public class import java.util.HashMap;

public class LongestSubArrayWithGivenSumByPrefixSumWithHashMap{


    public static int a(int[]arr ,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for(int i=0; i<arr.length; i++){

            prefixSum = prefixSum+ arr[i];

            if(prefixSum == target){

                maxLength = i+1;
            }
            if(map.containsKey(prefixSum - target)){

               int start = map.get(prefixSum - target);

               int length = i - start;

               if(length > maxLength){
                maxLength = length;
               }
               
            }
            if(!map.containsKey(prefixSum)){

                map.put(prefixSum,i);
                
               }
            }
            return maxLength;
        }
    public static void main(String[] args) {
        
        int[]arr = {4,3,2,3,2,1,3,5,6};

        int target = 9;

        System.out.println(a(arr, target));
    }

}