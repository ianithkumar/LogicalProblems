package LinkedList;

public class LinkedListCycle {
  public static void main(String[] args) {
    ListNode list = new ListNode(3, new ListNode(10, new ListNode(5, new ListNode(2))));
    list.next.next.next.next = list.next.next;
    System.out.println(isLinkedListCycle(list));
  }

  private static boolean isLinkedListCycle(ListNode head) {
    if (head == null) return false;
    ListNode slow = head;
    ListNode fast = head.next;

    while (slow != fast) {
      if (fast == null || fast.next == null) return false;
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }
}
