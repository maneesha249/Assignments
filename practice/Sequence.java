import java.util.*;
public class Sequence{

   public static void main(String[] args){
   int num1=2;
   int num2=1;
   int num3=3;
   int nextNumber;
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter input:");
   n=sc.nextInt();
   System.out.print(num1+" "+num2+" "+num3+" ");
   while(num3<n){
   nextNumber=num1+num2+num3;
   if(nextNumber>n)
   break;
   System.out.print(nextNumber+" ");
   num1=num2;
   num2=num3;
   num3=nextNumber;
}
}
}
 