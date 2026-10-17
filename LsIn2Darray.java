package javaPrograms;
import java.util.Arrays;
public class LsIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4},
                {5,6,7},
                {8,9,10,11}
        };

        int target = 11;

        int[] ans = Search(arr,target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr,int target) {
        if (arr.length == 0) {
            return new int[]{-1,-1};
        }

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
