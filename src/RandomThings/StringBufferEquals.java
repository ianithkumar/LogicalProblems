package RandomThings;

public class StringBufferEquals {
  public static void main(String a[]){
    String name1 = "Anith";
    StringBuffer name2 = new StringBuffer(name1);

    System.out.println(name2.equals(name1));
  }
}
