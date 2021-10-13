public class BinarySearch {
    public static void main(String[] args){
        int[] arr={4, 8, 15, 16, 23, 42};
        int n=15;
        int[] arr1={-131, -82, 0, 27, 42, 68, 179};
        int n1=42;
        int[] arr2={11, 22, 33, 44, 55, 66, 77};
        int n2=90;
        int[] arr3={1, 2, 3, 5, 6, 7};
        int n3=4;
        System.out.println("the index of searchKey: "+binarySearch(arr,n));
        System.out.println("the index of searchKey: "+binarySearch(arr1,n1));
        System.out.println("the index of searchKey: "+binarySearch(arr2,n2));
        System.out.println("the index of searchKey: "+binarySearch(arr3,n3));
    }
    public static int binarySearch(int[] Arr,int searchKey){
        int leftIndex=0;
        int rightIndex=Arr.length-1;
        int index=-1;
        if(Arr.length==0){
            index=-1;
        }
        while(leftIndex<=rightIndex){

            int middleIndex=(int) Math.floor((leftIndex+rightIndex)/2);
            if(Arr[middleIndex]<searchKey){
                leftIndex=middleIndex+1;
            }else if (Arr[middleIndex]>searchKey){
                rightIndex=middleIndex-1;
            }else{
                index=middleIndex;
                break;
            }
        }

        return index;
    }
}
