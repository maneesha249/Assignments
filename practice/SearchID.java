import java.util.*;
public class SearchID{
  
   public static void main(String args[]){

  int n;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number participants:");
  n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter the IDs:");
  for(int i=0;i<n;i++)
  arr[i]=sc.nextInt();
  System.out.println("Enter ID to search:");
  int search_id=sc.nextInt();
  while(search_id!=0){
  int flag=0;
  for(int i=0;i<n;i++){
  if(arr[i]==search_id){
  flag=1;
  break;
}
}
  if(flag==1)
     System.out.println("Participant with ID "+search_id+" exist"); 
  else
     System.out.println("Participant with ID "+search_id+" does not exists");
  System.out.println("Enter ID to search:");
  search_id=sc.nextInt();
}
}
}