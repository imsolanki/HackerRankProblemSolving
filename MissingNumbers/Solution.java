import java.util.*;

public class Solution {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {

        TreeMap<Integer,Integer> hm =new TreeMap<>();
        for(int i = 0; i < brr.length; i ++) {
            if(hm.containsKey(brr[i])){
                int count = hm.get(brr[i]);
                //get return the value associated with brr[i](key)
                hm.put(brr[i], count+1);
            }
            else{
                hm.put(brr[i], 1);
            }
        }
        System.out.println(hm.toString());

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int count= hm.get(arr[i]);
                hm.put(arr[i],count-1);
                if(hm.get(arr[i]).equals(0)){
                    hm.remove(arr[i]);
                }
            }
        }
        int []result =new int[hm.size()];
        int i=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key= entry.getKey();
            int value= entry.getValue();
            result[i]=key;
            i++;
        }
        System.out.println(hm.toString());

        return result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input=sc.nextInt();
        int[]arr =new int[input];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        input=sc.nextInt();
        int[]brr=new int[input];
        for(int i=0;i<brr.length;i++){
            brr[i]=sc.nextInt();
        }
        int[]result =missingNumbers(arr,brr);
        System.out.println(Arrays.toString(result));
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
