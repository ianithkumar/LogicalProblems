package Arrays;
//Replace each element with the largest element on the right
public class GreatestElementOnTheRight {
   public static void main(String[] a ){
     int arr[] = {1,2,3,4,5};
     int j=arr.length-1;
     int max = arr[j];
     arr[j] = -1;

     for(int i=j-1;i>=0;i--){
       int temp = arr[i];
       arr[i] = max;
       if(temp>max){
         max = temp;
       }
     }
     for(int num:arr){
       System.out.print(num+" ");
     }
   }
}
