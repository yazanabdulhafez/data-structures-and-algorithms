import java.util.Arrays;

public class insertMiddle  {
    public static void main(String[] args) {
        int[] arr = {2,4,6,-8};
        System.out.println("before inserting: "+Arrays.toString(arr));
        int n=5;
        System.out.println("the value to be inserted: "+n);
        int[] outputArray=insertShiftArray(arr,n);
        System.out.println("after inserting: "+Arrays.toString(outputArray));
    }
    public static int[] insertShiftArray(int[] arr,int n) {
        int[] newArr = new int[arr.length+1];
        int middleIndex=(int)Math.ceil(arr.length/2.0);
        System.out.println("middleIndex= "+middleIndex);
        for (int i = 0 ; i <=middleIndex ; i++) {
            if (i==middleIndex) {
                newArr[i] =n;
            }else{
                newArr[i]=arr[i];
            }
            
        }
        for (int i = middleIndex; i < arr.length ; i++) {
            newArr[i+1] = arr[i];
        }

        return newArr;
    }
}
