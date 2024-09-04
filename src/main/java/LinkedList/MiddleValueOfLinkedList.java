package LinkedList;

public class MiddleValueOfLinkedList {
  public static void main(String[] args) {
    ListNode list = new ListNode(3);
    list.next = new ListNode(4);
    list.next.next = new ListNode(5);
    list.next.next.next = new ListNode(10);
    list.next.next.next.next = new ListNode(15);
    list.next.next.next.next.next = new ListNode(17);
    list.next.next.next.next.next.next = new ListNode(20);

    System.out.println(middleValueOfLinkedList(list));
  }

  private static int middleValueOfLinkedList(ListNode head) {
    if (head == null) {
      return 0;
    }
    ListNode slow = head;          // 3  10  5  2  4
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.val;
  }
}
