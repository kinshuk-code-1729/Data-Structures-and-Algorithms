/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
		 if(k == 1){
		     return null;
		 }
		 
		 Node tmp = head;
		 Node prev = null;
		 int count = 1;
		 
		 while(tmp != null){
		     if(count == k){
		         count = 0;
		         prev.next = tmp.next;
		     }
		     
		     else{
		         prev = tmp;
		     }
		     
		     count++;
		     
		     tmp = tmp.next;
		 }
		 return head;
    }
}
