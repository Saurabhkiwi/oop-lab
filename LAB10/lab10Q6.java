import java.util.*;
public class lab10Q6 {
 public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number");
    double num=in.nextDouble();
    try
    {
        if(num<0)
        {
            throw new Exception();
        }
        System.out.print("Sqaure root="); 
    }
    catch(Exception e)
    {
        System.out.print("Negative number was entered\nsqaure root=i");
        num=-num;
    }
    double root=Math.sqrt(num);
    System.out.print(root);
 }  
}