/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del_node)
    {
         Node tmp = del_node.next;
         del_node.data = tmp.data;
         del_node.next = tmp.next;
         tmp = null;
    }
}
