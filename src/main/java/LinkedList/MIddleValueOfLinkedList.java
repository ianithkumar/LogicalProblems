package LinkedList;

public class MIddleValueOfLinkedList {
  public static void main(String[] args){
    ListNode list = new ListNode(3,new ListNode(10,new ListNode(5,new ListNode(2,new ListNode(4)))));
    System.out.println(middleValueOfLinkedList(list));
  }
  private static int middleValueOfLinkedList(ListNode head){
    if(head==null){
      return 0;
    }
    ListNode slow = head;
    ListNode fast = head.next;

    while(slow!=fast){
      if(fast==null || fast.next==null){
        return 0;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.val;
  }
}
