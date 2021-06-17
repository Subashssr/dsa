//Given an array Arr[] of size N. For every element in the array,
// the task is to find the index of the farthest element in the array
// to the right which is smaller than the current element.
// If no such number exists then print -1.

import java.io.*;
import java.util.stream.*;

public class FarthestNumber{

  static int[] farNumber(int N, int[] arr){
    int[] res = new int[N];
    for(int ii = 0; ii < N; ii++){
      int cur = -1;
      int min = arr[ii];
      for(int jj = N-1; jj > ii; jj--){
        if(min > arr[jj]){
          cur = jj;
          break;
        }
      }
      res[ii] = cur;
    }
    return res;
  }

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the array elements sapace seperated and hit Enter\n");
    int arr[] = Stream.of(br.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
    arr = farNumber(arr.length, arr);

    for(int a : arr)
      System.out.print(a+" ");
   }
}
