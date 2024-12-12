
public class Main {

    
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {

        ListNode small = null;
        ListNode big  = null;
        ListNode arrangedStart = null;
        ListNode arragedBigStart = null;

        while(head!=null){
            if(head.val < x){
                if(small == null){
                    small = head;
                    arrangedStart = head;
                }else{
                    small.next = head;
                    small = small.next;
                }
            } else {
                if(big == null){
                    arragedBigStart =head;
                    big = head;
                }else{
                    big.next = head;
                    big = big.next;
                }
            }
            head = head.next;
        }
        if(small == null){
            return arragedBigStart;
        }else{
            if(big!=null){
                big.next = null;
            }
            small.next = arragedBigStart;
            return arrangedStart;
        }
    }

}


