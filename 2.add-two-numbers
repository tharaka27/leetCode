import java.util.ArrayList;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //========== Extracting values to ArrayList in relavant Structure==========
        ArrayList<Integer> addv = new ArrayList<Integer>();
        int temp = 0;
        
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                int value  = l1.val + l2.val + temp;
                if(value >=10){
                    value = value - 10;
                    temp = 1;
                }else{
                    temp = 0;
                }
                addv.add(value);
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 == null && l2 != null){
                int value  = l2.val + temp;
                if(value >=10){
                    value = value - 10;
                    temp = 1;
                }else{
                    temp = 0;
                }
                addv.add(value);
                l2 = l2.next;
            }else if(l1 != null && l2 == null){
                int value  = l1.val + temp;
                if(value >=10){
                    value = value - 10;
                    temp = 1;
                }else{
                    temp = 0;
                }
                addv.add(value);
                l1 = l1.next;
            }
        }
        
        // for(int i=0;i<addv.size();i++){
        //     System.out.println(addv.get(i));
        // }
        if(temp == 1){
            addv.add(1);
        }
        //======== Building up the singly-linked list========================
        
        ListNode head = new ListNode(addv.get(0));
        ListNode first = head;
        for(int i=1;i<addv.size();i++){
            ListNode node = new ListNode(addv.get(i));
            head.next = node ;
            // System.out.print(head);
            // System.out.print(' ' );
            // System.out.println(head.next);
            
            head = head.next ;
            
        }
        
        // System.out.println(first);
        return first;
        }
           
}
