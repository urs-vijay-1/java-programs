package javaPrograms;
public class agnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {70,56,43,36,23,17,9,-12,-32};
        int target = 17;
        int ans = agnosticBSearch(arr,target);
        System.out.println(ans);
    }

    static int agnosticBSearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(arr[start] <= arr[end]){
//                if(target == arr[mid]){
//                    return mid;
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
