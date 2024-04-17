//import java.util.*;   //------problem1 is to check whether the entered character is upper or lower
public class Solution {
   public static void main(String[] args) {
//        // Write your code here
//        Scanner sc=new Scanner(System.in);
//        char alpha=sc.next().charAt(0);
//        if(alpha>=65 && alpha<=90){
//            System.out.println("1");
//        }
//        else if(alpha>=97 && alpha<=122){
//            System.out.println("0");
//        }
//        else{
//            System.out.println("-1");
//        }
//
//
//    }
//}

//-------problem 2---------

//public class Solution {
//    public static void main(String[] args) {
//
//    }
//    public static int dataTypes(String type) {
//        // Write your code here
//        switch(type){
//            case "Integer" :
//                return 4;
//            case "Long":
//                return 8;
//            case "Float":
//                return 4;
//            case "Double":
//                return 8;
//            case "Character":
//                return 1;
//        }
//        return 0;
//    }
//}

   }}
//------problem3------
//here this is the third problem of basics of java ,here switch cases are used
//import java.util.*;
//public class Solution {
//   public static double areaSwitchCase(int ch, double []a) {
//      Scanner sc=new Scanner(System.in);
//      double pi =3.14159265359;
//
//      double area;
//
//      switch(ch){
//
//         case 1:{
//
//            area=pi*a[0]*a[0];
//
//            return area;
//
//         }
//
//         case 2:
//
//            area=a[0]*a[1];
//
//            return area;
//
//         //break;
//
//      }
//
//        /*
//
//        if(ch==1){
//
//            area=pi*a[0]*a[0];
//
//            return area;
//
//        }
//
//        else if(ch ==2){
//
//            area= a[0]*a[1];
//    return area;
//        }
//        */
//      return 0;
//   }
//}

//problem 4 -find the count of no's that are evenly divisible
//public class Solution {
//   public static int countDigits(int n){
//      // // Write your code here.
//      // int a=n,c=0;
//      // while(n>0){
//      //     int r= n%10;
//      //     if(r!=0){
//      //         if(a%r==0){
//      //             c++;
//      //             n=n/10;
//      //         }
//      //     }
//      // }
//      // return c;
//      int r=0;
//
//      int no=n;
//
//      int count=0;
//
//      while(n>0){
//
//
//
//         r= n%10;
//
//         if(r !=0 && no%r==0){
//
//            count++;
//
//         }
//
//         n=n/10;
//
//      }
//
//
//
//      return count;
//   }
//
//}
