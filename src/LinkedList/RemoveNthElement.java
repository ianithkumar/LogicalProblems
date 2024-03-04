package LinkedList;

import java.util.LinkedList;

public class RemoveNthElement {
    public static void main(String a[]){
      LinkedList list = new LinkedList();
      list.add(18);
      list.add(45);
      list.add(36);
      list.remove(list.size()-1);
      System.out.println(list);
    }
}
