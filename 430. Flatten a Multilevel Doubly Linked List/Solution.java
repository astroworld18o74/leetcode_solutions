/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        fn(head);
        return head;
    }
    public Node fn(Node head){
        if(head==null)return head;
        if(head.child==null){
            if(head.next==null)return head;
            return fn(head.next);
        }
        else{
            Node child=head.child;
            Node next=head.next;
            head.child=null;
            Node childnext=fn(child);
            head.next=child;
            child.prev=head;
            if(next!=null){
                childnext.next=next;
                next.prev=childnext;
                return fn(next);
            }
            return childnext;
        }
    }
}
