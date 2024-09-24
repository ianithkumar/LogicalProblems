package src.main.java.OtherThings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeneratingTime {
  public static void main(String[] args){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    System.out.println(dtf.format(now));
  }
}
