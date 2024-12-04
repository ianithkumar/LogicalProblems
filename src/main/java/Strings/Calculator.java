package Strings;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc  =new Scanner(System.in);
    System.out.print("Enter the expression : ");
    String expression = sc.nextLine();
    char[] stringArray = expression.toCharArray();
    int result = 0;
    int i=0;
    while(i<stringArray.length){
      int num = 0;
      if(!(stringArray[i]=='+'||stringArray[i]=='-'||stringArray[i]=='*'||stringArray[i]=='/')){
        num=(num+(int)stringArray[i])*10;
        i++;
      }
      else{
        num/=10;
        int nextNum = 0;
        switch(stringArray[i]){
          case '+':
            nextNum = findNextNum(stringArray,i);
            result = num+nextNum;
            break;
          case '-':
            nextNum = findNextNum(stringArray,i);
            result = num-nextNum;
            break;
          case '*':
            nextNum = findNextNum(stringArray,i);
            result = num*nextNum;
            break;
          case '/':
            nextNum = findNextNum(stringArray,i);
            result = num/nextNum;
            break;
        }
        break;
      }
    }
    System.out.println(result);
  }
  private static int findNextNum(char[] stringArray,int i){
    int num = 0;
    for(int j=i;j<stringArray.length;j++){
      num+=stringArray[j]*10;
    }
    return num/10;
  }
}