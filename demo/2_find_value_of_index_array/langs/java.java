//User Boilerplate
import java.util.Scanner;

class Solution {
    public getValueAtIndex(int index, int arr[]) {
        //write your code here
    }
}


//compiler boilderplate
class Driver {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfElements = sc.nextInt();
        int arr[] = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();

        Solution sol = new Solution();
        System.out.print(sol.getValueAtIndex(index, arr));
    }
}