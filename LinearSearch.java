package javaPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,23,4,65,27,1};
        int target = 1;
        int ans = Search2(arr,target,2,5);
        System.out.println(ans);
    }

//    static int Search(int[] arr,int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }


    //searching  in b/w range
    static int Search2(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i=start;i<=end;i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
