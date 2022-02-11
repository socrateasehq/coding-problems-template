//User Boilerplate
import java.util.Scanner;

class Solution {
    public Character firstChar(String input) {
        //write your code here
    }
}


//compiler boilderplate
class abc{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        scanner.close();

        Solution sol = new Solution();
        System.out.print(Character.toString(sol.firstChar(myString)));
    }
}