import java.util.*;
public class RequiredRunRate{

   public static void main(String args[]){
    int overs_bowled,target;
    float current_run_rate,required_run_rate;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of overs bowled so far:");
    overs_bowled=sc.nextInt();
    System.out.println("Enter the current run rate:");
    current_run_rate=sc.nextFloat();
    System.out.println("Enter the target:");
    target=sc.nextInt();
    required_run_rate=(target-(current_run_rate*overs_bowled))/(50-overs_bowled);
    System.out.print("Required Run Rate is:"+required_run_rate);

}
}