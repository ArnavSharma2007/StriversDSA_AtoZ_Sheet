import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,2};
        occurences(arr);
        occurencesOptimized(arr);
        frequency(arr);
    }

    //Total occurences in an array
    //Brute force
    static void occurences(int[] n){
        for(int i = 0; i < n.length; i++){
            int count = 0;
            for(int j = 0; j < n.length; j++){
                if(n[i] == n[j]) count++;
            }
            System.out.println(n[i] + " appears " + count + " times.");
        }
    }

    //Optimal solution
    static void occurencesOptimized(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
        }
    }

    //Highest or Lowest Frequency Element
    static void frequency(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = map.get(arr[0]);
        int maxValue = arr[0];
        int min = map.get(arr[0]);
        int minValue = arr[0];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() < min){
                min = entry.getValue();
                minValue = entry.getKey();
            } else if (entry.getValue() > max){
                max = entry.getValue();
                maxValue = entry.getKey();
            }
        }
        System.out.println(minValue + " " + maxValue);    
    }
}
