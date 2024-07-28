package LinkedList;

import Arrays.Leet34;

public class MergeTwoSortedLinkedList {
  public static void main(String[] a){
    ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
    ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
    ListNode result = mergeTwoSortedLinkedList(list1,list2);

    while(result.next!=null){
      System.out.print(result.val+" ");
    }
  }
  private static ListNode mergeTwoSortedLinkedList(ListNode list1,ListNode list2){
    ListNode result = new ListNode();
    ListNode temp = result;
    while(list1!=null && list2!=null){
      if(list1.val>list2.val){
        temp.val = list1.val;
        list1 = list1.next;
      }
      else {
        temp.val = list2.val;
        list2 = list2.next;
      }

      if(list1.next!=null){
        temp.next = list1;
      }
      if(list2.next!=null){
        temp.next = list2;
      }
      temp = temp.next;
    }
    return result.next;
  }
}
