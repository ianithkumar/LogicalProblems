package src.main.java.OtherThings;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckingArrayToArrayList {
  public static void main(String[] args){
    Integer[] arr = {1,2,3,4,5};
    ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
    System.out.println(arrList);
  }
}


