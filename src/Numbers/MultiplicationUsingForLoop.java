package Numbers;

public class MultiplicationUsingForLoop {
  public static void main(String...args){
    int a = 30;
    int b = 4;
    int answer = 0;
    for(int i=1;i<=b;i++){
      answer = answer + a;
    }
    System.out.println(answer);
  }
}
