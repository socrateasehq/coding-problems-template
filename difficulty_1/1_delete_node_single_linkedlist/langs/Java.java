/** User Boilerplate */

import java.util.*;

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
	Node deleteNode(Node head, int x)
	{
        //write your code here
		if (head == null)
            return null;
 
        Node temp = head;
 
        if (x == 1)
        {
            head = temp.next;
            return head;
        }
 
      
		x--;
        for (int i=1; temp!=null && i<x; i++)
		{
            temp = temp.next;
		}
 
        if (temp == null || temp.next == null)
            return null;
 
		if(temp.next.next == null)
			temp.next = null;
		else
			temp.next = temp.next.next;
		
		return head;
	}
}

/** Compiler Boilerplate */

class DeleteNode {
    Node head;
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        DeleteNode llist = new DeleteNode();

        int a1 = sc.nextInt();
        Node head = new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i<n;i++) {
            int a = sc.nextInt();
            llist.addToTheLast(new Node(a));

        }
        int x = sc.nextInt();
        Solution sol = new Solution();

        Node result = sol.deleteNode(llist.head, x);
        llist.printList(result);
        
    }
}