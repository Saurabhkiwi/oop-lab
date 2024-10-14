import java.util.*;
class handle extends Exception
{
    float input;
    public String toString()
    {
        return "Error: Handled";
    }
}
class lab10Q4{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 to cause an error for handling");
        try
        {
            if(in.nextInt()==1)
            {
                throw new handle();
            }
        }
        catch(handle e)
        {
            System.out.println(e.toString());
        }
    }
}
