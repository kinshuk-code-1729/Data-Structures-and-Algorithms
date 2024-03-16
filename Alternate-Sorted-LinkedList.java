/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
       Node head1 = new Node(-1);
       Node head2 = new Node(-1);
       
       Node ch1 = head1;
       Node ch2 = head2;
       
       Node cur = head;
       
       while(cur != null){
           ch1.next = cur;
           ch1 = ch1.next;
           
           cur = cur.next;
           
           if(cur != null){
               ch2.next = cur;
               ch2 = ch2.next;
               
               cur = cur.next;
           }
           
           ch1.next = null;
           ch2.next = null;
       }
       
       head1 = head1.next;
       head2 = head2.next;
       
       head2 = reverseList(head2);
       return sortedMerge(head1, head2);
       
   }
   
   public Node sortedMerge(Node head1, Node head2) {
        Node tmp = new Node(0);
        Node cur = tmp;
        
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                cur.next = head1;
                head1 = head1.next;
            }
            else{
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        
        if(head1 != null){
            cur.next = head1;
        }
        
        if(head2 != null){
            cur.next = head2;
        }
        
        return tmp.next;
   }
   
   public Node reverseList(Node head){
        Node prev = null;
        Node cur = head;
        Node next = null;
        
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        head = prev;
        return head;
    }

}
