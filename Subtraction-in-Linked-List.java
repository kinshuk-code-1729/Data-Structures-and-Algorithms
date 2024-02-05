class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node cur = head;
        Node newNode = new Node(data);
        
        // CASE 1 : Empty Linked List
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        
        // CASE 2 : New Node is smaller than head
        else if(data <= head.data){
            while(cur.next != head){
                cur = cur.next;
            }
            cur.next = newNode;
            newNode.next = head;
            return newNode;
        }
        
        // CASE 3 : New Node can be inserted in between the list
        else{
            while(cur.next != head && data > cur.next.data){
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
            return head;
        }
    }
}
