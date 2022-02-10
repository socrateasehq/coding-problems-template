import java.util.ArrayList;
import java.util.*;
import java.io.BufferedReader;
import java.io.*;

/** User Boilerplate */
class Solution
{
    public int minSwaps(int[] arr, int N)
    {
        //write your code here
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) 
        {
            if (arr[i] != temp[i]) 
            {
                ans++;
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int indexOf(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}

/** Complier Boilerplate */

class MinSwaps
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().trim().split(" ");
        int[] nums = new int[S.length];
        for (int i = 0; i < S.length; i++) {
            nums[i] = Integer.parseInt(S[i]);
        }
        Solution sol = new Solution();
        int ans = sol.minSwaps(nums, S.length);
        System.out.println(ans);
    }
}