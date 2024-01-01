/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        return addNodes(l1,l2,0);
    }

    ListNode* addNodes(ListNode* l1, ListNode* l2, int eb) {
        if(!l1 && !l2 && eb == 0) return NULL;
        int x=0, y=0;
        if(l1){
            x=l1->val;
        }
        if(l2){
            y=l2->val;
        }
        int v = x+y+eb;
        ListNode *h = new ListNode(v%10);
        h->next = addNodes(l1? l1->next: NULL , l2? l2->next: NULL, v/10);
        return h;
    }
};