import java.util.Scanner;
class Factorial{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("enter a number:");
int num = sc.nextInt();
long factorial = 1;
for(int i=1;i<=num;i++){
factorial=factorial*i;
}
System.out.print("factorial : " + factorial);
}}