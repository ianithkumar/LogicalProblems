package Numbers;

import java.util.Scanner;

public class LengthOfCuboid {
  public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the cuboid = ");
    int length = sc.nextInt();
    System.out.println("Enter the breadth of the cuboid = ");
    int breadth = sc.nextInt();
    System.out.println("Enter the height of the cuboid = ");
    int height = sc.nextInt();
    int area = 2*((length*breadth)+(breadth*height)+(height*length));
    System.out.println("Area of the cuboid is = "+area);
  }
}
