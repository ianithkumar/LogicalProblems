package Strings;

//UserId = smallerName[0] + longerName + num1[num2]fromLeftToRight + num1[num2]fromRightToLeft
public class UserIdMaker {
  public static void main(String[] args) {
    String name1 = "Anith";
    String name2 = "kumar";
    int num1 = 543678;
    int num2 = 2;
    String result = userIdMaker(name1, name2, num1, num2);
    System.out.println(result);
  }

  private static String userIdMaker(String name1, String name2, int num1, int num2) {
    String smallerName = "";
    String longerName = "";
    int name1Size = name1.length();
    int name2Size = name2.length();

    if (name1Size > name2Size) {
      smallerName = name1;
      longerName = name2;
    } else if (name1Size < name2Size) {
      smallerName = name2;
      longerName = name1;
    } else {
      if (name1.compareTo(name2) > 0) {
        smallerName = name2;
        longerName = name1;
      } else {
        smallerName = name1;
        longerName = name2;
      }
    }

    String userId = "";
    String num1Temp = String.valueOf(num1);
    int numSize = num1Temp.length() - num2;
    userId += smallerName.charAt(0);
    userId += longerName;
    userId += num1Temp.charAt(num2 - 1);
    userId += num1Temp.charAt(numSize);

    StringBuilder finalUserId = new StringBuilder();

    for (int i = 0; i < userId.length(); i++) {
      if (!Character.isDigit(userId.charAt(i))) {
        if (Character.isLowerCase(userId.charAt(i))) {
          finalUserId.append(Character.toUpperCase(userId.charAt(i)));
        } else if (Character.isUpperCase(userId.charAt(i))) {
          finalUserId.append(Character.toLowerCase(userId.charAt(i)));
        }
      } else {
        finalUserId.append(userId.charAt(i));
      }
    }
    return finalUserId.toString();
  }
}
