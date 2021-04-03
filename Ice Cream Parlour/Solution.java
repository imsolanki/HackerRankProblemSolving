import java.util.Scanner;

public class Solution{

    static int[] icecreamParlor(int m, int[] arr) {
        int index1=0;
        int index2=0;

        outerloop:
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+(arr[j])==m){
                    index1=i;
                    index2=j;
                    break outerloop;
                }
            }
        }

        int[]arrReturn =new int[2];
        arrReturn[0]=index1+1;
        arrReturn[1]=index2+1;
        return arrReturn;
       
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int totalCase =s.nextInt();
        int count=0;
        int[] result;
        while(true){
            count =count+1;
            int money =s.nextInt();
            int arrSize =s.nextInt();
            int[]arr=new int[arrSize];
            for(int i=0;i<arr.length;i++){
                arr[i]=s.nextInt();
            }
            result=icecreamParlor(money,arr);
            System.out.println(result[0]+" "+result[1]);
            if(count==totalCase){
                break;
            }

        }


    }
}

