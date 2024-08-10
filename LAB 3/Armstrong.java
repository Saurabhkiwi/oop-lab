import java.util.Scanner ;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to be checked: ");
        int num = sc.nextInt();
        int temp = num;
        int n= 0;
        while(temp!=0){
            temp= temp/10;
            n++;
        }
        int copy = num;
        int sum= 0;
        while(num>0){
            int r = num%10;
            sum =(int) (sum + Math.pow(r,n));

            num = num/10; 

        }
        if(sum == copy){
            System.out.println(copy + " is an armstrong number !!!");
        }
        else 
        {
            System.out.println("not an armstrong number!!!");
        }


    }
}