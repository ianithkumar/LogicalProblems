package LinkedList;

public class MergeTwoSortedLinkedList {
  public static void main(String[] a) {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(5)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode result = mergeTwoSortedLinkedList(list1, list2);

    while (result != null) {
      System.out.print(result.val + " ");
      result = result.next;
    }
  }

  private static ListNode mergeTwoSortedLinkedList(ListNode list1, ListNode list2) {
    ListNode result = new ListNode(0);
    ListNode temp = result;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        temp.next = list1;
        list1 = list1.next;
      } else {
        temp.next = list2;
        list2 = list2.next;
      }
      temp = temp.next;
    }
    if (list1 != null) {
      temp.next = list1;
    }
    if (list2 != null) {
      temp.next = list2;
    }

    return result.next;
  }
}
