package src.main.java.OtherThings;
import java.util.Scanner;
public class ClockAngleCalculation
{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the hour : ");
    int hour = sc.nextInt();
    System.out.println("Enter the minutes : ");
    int minute = sc.nextInt();
    System.out.println(clockAngleCalculation(hour,minute));
  }
  private static double clockAngleCalculation(int hour,int minute){
    double hourAngle = (hour + ((double) minute /60))*30;
    double minuteAngle = minute*6;
    double clockAngle = Math.abs(hourAngle-minuteAngle);
    if(clockAngle>180){
      clockAngle = 360 - clockAngle;
    }
    return clockAngle;
  }
}
