/** User Boilerplate */

import java.util.*;
import java.io.*;
import java.lang.*;

/*
 * Do not remove or modify this section
 */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
/*
 * Do not remove or modify above section
 */

class Solution
{
	static boolean detectLoop(Node h)
	{
        //write your code here
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.next;
        }

        return false;
	}
}

/** Compiler Boilerplate */

class DetectLoopDriver {
    public static void createLoop(Node head, Node tail, int x) {
        if (x == -1) return;

        Node curr = head;
        for (int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = sc.nextInt();
        Node head = new Node(num);
        Node tail = head;

        for (int i = 0; i< n - 1;i++) {
            num = sc.nextInt();
            tail.next = new Node(num);
            tail = tail.next;
        }

        int pos = sc.nextInt();
        createLoop(head, tail, pos);

        Solution sol = new Solution();

        if (sol.detectLoop(head))
            System.out.println(1);
        else
            System.out.println(0);        
    }
}