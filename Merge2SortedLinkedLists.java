/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    Node sortedMerge(Node head1, Node head2) {
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
}
