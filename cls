[33mcommit dda5403c93d27b6cd743ee81571d566d6e83cade[m[33m ([m[1;36mHEAD[m[33m -> [m[1;32mmaster[m[33m, [m[1;31morigin/master[m[33m)[m
Author: ianithkumar <anithani1206@gmail.com>
Date:   Thu Aug 15 12:27:37 2024 +0530

    Updated Some Packages

[1mdiff --git a/src/main/java/BFS/MinimumDepthOfBinaryTree.java b/src/main/java/BFS/MinimumDepthOfBinaryTree.java[m
[1mindex 9afe5e0..0a56b10 100644[m
[1m--- a/src/main/java/BFS/MinimumDepthOfBinaryTree.java[m
[1m+++ b/src/main/java/BFS/MinimumDepthOfBinaryTree.java[m
[36m@@ -7,7 +7,7 @@[m [mpublic class MinimumDepthOfBinaryTree {[m
   public static void main(String[] a) {[m
     TreeNode head = new TreeNode(3, new TreeNode(9, new TreeNode(5), new TreeNode(7)), new TreeNode(20, new TreeNode(15), new TreeNode(17)));[m
     int result = minimumDepthOfBinaryTree(head);[m
[31m-    System.out.println("The Minimum Dpeth Level Of Binary Tree Is : ");[m
[32m+[m[32m    System.out.println("The Minimum Depth Level Of Binary Tree Is : ");[m
     System.out.println(result);[m
   }[m
 [m
[36m@@ -26,7 +26,6 @@[m [mpublic class MinimumDepthOfBinaryTree {[m
         if (node.left == null || node.right == null) {[m
           return levelSum;[m
         }[m
[31m-[m
         if (node.left != null) {[m
           queue.offer(node.left);[m
         }[m
[1mdiff --git a/src/main/java/Strings/Leet242ValidAnagram.java b/src/main/java/Strings/Leet242ValidAnagram.java[m
[1mnew file mode 100644[m
[1mindex 0000000..dbe0a35[m
[1m--- /dev/null[m
[1m+++ b/src/main/java/Strings/Leet242ValidAnagram.java[m
[36m@@ -0,0 +1,28 @@[m
[32m+[m[32mpackage Strings;[m
[32m+[m
[32m+[m[32mpublic class Leet242ValidAnagram {[m
[32m+[m[32m  public static void main(String[] a) {[m
[32m+[m[32m    String s1 = "rat";[m
[32m+[m[32m    String s2 = "car";[m
[32m+[m[32m    System.out.println(isValidAnagram(s1, s2));[m
[32m+[m[32m  }[m
[32m+[m
[32m+[m[32m  private static boolean isValidAnagram(String s1, String s2) {[m
[32m+[m[32m    if (s1.length() != s2.length()) {[m
[32m+[m[32m      return false;[m
[32m+[m[32m    }[m
[32m+[m[32m    int[] count = new int[26];[m
[32m+[m[32m    for (int i = 0; i < s1.length(); i++) {[m
[32m+[m[32m      count[s1.charAt(i) - 'a']++;[m
[32m+[m[32m    }[m
[32m+[m[32m    for (int i = 0; i < s1.length(); i++) {[m
[32m+[m[32m      count[s2.charAt(i) - 'a']--;[m
[32m+[m[32m    }[m
[32m+[m[32m    for (int j : count) {[m
[32m+[m[32m      if (j != 0) {[m
[32m+[m[32m        return false;[m
[32m+[m[32m      }[m
[32m+[m[32m    }[m
[32m+[m[32m    return true;[m
[32m+[m[32m  }[m
[32m+[m[32m}[m
[1mdiff --git a/src/main/java/Strings/LongestSubstringWithoutRepeatingCharacers.java b/src/main/java/Strings/LongestSubstringWithoutRepeatingCharacers.java[m
[1mnew file mode 100644[m
[1mindex 0000000..0cd42c9[m
[1m--- /dev/null[m
[1m+++ b/src/main/java/Strings/LongestSubstringWithoutRepeatingCharacers.java[m
[36m@@ -0,0 +1,15 @@[m
[32m+[m[32mpackage Strings;[m
[32m+[m
[32m+[m[32mimport java.util.HashSet;[m
[32m+[m
[32m+[m[32mpublic class LongestSubstringWithoutRepeatingCharacers {[m
[32m+[m[32m  public static void main(String[] args){[m
[32m+[m[32m    String s = "cadbzabcd";[m
[32m+[m[32m    System.out.println(longestSubstringWithoutRepeatingCharacters(s));[m
[32m+[m[32m  }[m
[32m+[m[32m  private static int longestSubstringWithoutRepeatingCharacters(String s){[m
[32m+[m[32m    HashSet<Character> set = new HashSet<>();[m
[32m+[m[32m    for(int i=0;i<s.length();i++){[m
[32m+[m[32m    }[m
[32m+[m[32m  }[m
[32m+[m[32m}[m
[1mdiff --git a/src/main/java/Strings/UpcastingAndDowncasting.java b/src/main/java/Strings/UpcastingAndDowncasting.java[m
[1mdeleted file mode 100644[m
[1mindex 22832de..0000000[m
[1m--- a/src/main/java/Strings/UpcastingAndDowncasting.java[m
[1m+++ /dev/null[m
[36m@@ -1,22 +0,0 @@[m
[31m-package Strings;[m
[31m-[m
[31m-public class UpcastingAndDowncasting {[m
[31m-  static class A{[m
[31m-    public void show1(){[m
[31m-      System.out.println("IN A SHOW");[m
[31m-    }[m
[31m-  }[m
[31m-  static class B extends A{[m
[31m-    public void show2(){[m
[31m-      System.out.println("IN B SHOW");[m
[31m-    }[m
[31m-  }[m
[31m-  public static void main(String a[]){[m
[31m-    A obj = (A) new B();[m
[31m-    obj.show1();[m
[31m-[m
[31m-    B obj2 = (B) obj;[m
[31m-    obj2.show2();[m
[31m-[m
[31m-  }[m
[31m-}[m
[1mdiff --git a/target/classes/BFS/MinimumDepthOfBinaryTree.class b/target/classes/BFS/MinimumDepthOfBinaryTree.class[m
[1mindex d11f0c9..9144c06 100644[m
Binary files a/target/classes/BFS/MinimumDepthOfBinaryTree.class and b/target/classes/BFS/MinimumDepthOfBinaryTree.class differ
[1mdiff --git a/target/classes/Strings/CheckingStringSum.class b/target/classes/Strings/CheckingStringSum.class[m
[1mnew file mode 100644[m
[1mindex 0000000..84895c2[m
Binary files /dev/null and b/target/classes/Strings/CheckingStringSum.class differ
[1mdiff --git a/target/classes/Strings/Leet242ValidAnagram.class b/target/classes/Strings/Leet242ValidAnagram.class[m
[1mnew file mode 100644[m
[1mindex 0000000..867c437[m
Binary files /dev/null and b/target/classes/Strings/Leet242ValidAnagram.class differ
[1mdiff --git a/target/classes/Strings/LongestSubstringWithoutRepeatingCharacers.class b/target/classes/Strings/LongestSubstringWithoutRepeatingCharacers.class[m
[1mnew file mode 100644[m
[1mindex 0000000..6001421[m
Binary files /dev/null and b/target/classes/Strings/LongestSubstringWithoutRepeatingCharacers.class differ
[1mdiff --git a/target/classes/Strings/UpcastingAndDowncasting$A.class b/target/classes/Strings/UpcastingAndDowncasting$A.class[m
[1mdeleted file mode 100644[m
[1mindex 771421c..0000000[m
Binary files a/target/classes/Strings/UpcastingAndDowncasting$A.class and /dev/null differ
[1mdiff --git a/target/classes/Strings/UpcastingAndDowncasting$B.class b/target/classes/Strings/UpcastingAndDowncasting$B.class[m
[1mdeleted file mode 100644[m
[1mindex ba6d534..0000000[m
Binary files a/target/classes/Strings/UpcastingAndDowncasting$B.class and /dev/null differ
[1mdiff --git a/target/classes/Strings/UpcastingAndDowncasting.class b/target/classes/Strings/UpcastingAndDowncasting.class[m
[1mdeleted file mode 100644[m
[1mindex fae6c59..0000000[m
Binary files a/target/classes/Strings/UpcastingAndDowncasting.class and /dev/null differ
[1mdiff --git a/target/classes/Tree/Leet226InvertBinaryTree.class b/target/classes/Tree/Leet226InvertBinaryTree.class[m
[1mindex 89de867..aec6eb3 100644[m
Binary files a/target/classes/Tree/Leet226InvertBinaryTree.class and b/target/classes/Tree/Leet226InvertBinaryTree.class differ
