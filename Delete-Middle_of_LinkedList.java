/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head == null || head.next == null){
            return null;
        }
        
        Node tmp;
        int n = 0;
        
        for(tmp = head; tmp != null; tmp = tmp.next){
            n++;
        }
        
        int val = n / 2;
        
        Node k = head;
        
        for(int i = 1; i < val; i++){
            k = k.next;
        }
        
        k.next = k.next.next;
        
        return head;
    }
}
