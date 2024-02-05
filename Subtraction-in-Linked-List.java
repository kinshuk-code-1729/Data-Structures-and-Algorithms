/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/


//User function Template for Java
class Solution {
    public Node subLinkedList(Node head1, Node head2) {
        // remove zeroes
        while(head1 != null && head1.data == 0){
            head1 = head1.next;
        }
        
        while(head2 != null && head2.data == 0){
            head2 = head2.next;
        }
        
        int len1 = lsize(head1), len2 = lsize(head2);
        
        if(len1 == 0 && len2 == 0){
            return new Node(0);
        }
        
        if(len2 > len1){
            Node tmp = head1;
            head1 = head2;
            head2 = tmp;
        }
        
        if(len1 == len2){
            Node cur1 = head1, cur2 = head2;
            while(cur1.data == cur2.data){
                cur1 = cur1.next;
                cur2 = cur2.next;
                
                if(cur1 == null){
                    return new Node(0);
                }
            }
            if(cur2.data > cur1.data){
                Node tmp = head1;
                head1 = head2;
                head2 = tmp;
            }
        }
        
        head1 = rev(head1);
        head2 = rev(head2);
        Node res = null;
        
        while(head1 != null){
            int node1 = head1.data;
            int node2 = 0;
            if(head2 != null){
                node2 = head2.data;
            }
            
            if(node1 < node2){
                if(head1.next != null){
                    head1.next.data -= 1;
                }
                node1 += 10;
            }
            
            Node cur = new Node(node1 - node2);
            cur.next = res;
            res = cur;
            
            head1 = head1.next;
            
            if(head2 != null){
                head2 = head2.next;
            }
        }
        
        while(res != null && res.next != null){
            if(res.data == 0){
                res = res.next;
            }
            else{
                break;
            }
        }
        
        return res;
        
    }
    int lsize(Node head){
        int c = 0;
        for(Node cur=head; cur != null;cur = cur.next){
            c += 1;
        }
        return c;
    }
    Node rev(Node head){
        Node prev = null, cur = head,next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
